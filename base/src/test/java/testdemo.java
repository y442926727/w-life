import cn.hutool.core.date.DateTime;
import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.ComThread;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;
import org.junit.Test;

public class testdemo {


    @Test
    public void  test01(){


        ActiveXComponent ax = null;
        Dispatch excel = null;

        try {
            ComThread.InitSTA();
            ax = new ActiveXComponent("KET.Application");
            ax.setProperty("Visible", new Variant(false));
            //禁用宏
            ax.setProperty("AutomationSecurity", new Variant(3));
            Dispatch excels = ax.getProperty("Workbooks").toDispatch();
            Object[] obj = {
                    "C:\\Users\\CR160\\Documents\\WeChat Files\\wxid_fi7p5q9cnew822\\FileStorage\\File\\2023-09\\高水平专业（群）绩效指标.xlsx",
                    new Variant(false),
                    new Variant(false)
            };
            excel = Dispatch.invoke(excels, "Open", Dispatch.Method, obj, new int[9]).toDispatch();
            //转换格式
            Object[] obj2 = {
                    //PDF格式等于0
                    new Variant(0),
                    "C:\\Users\\CR160\\Documents\\WeChat Files\\wxid_fi7p5q9cnew822\\FileStorage\\File\\2023-09\\"+ DateTime.now().toString("yyyyMMddHHmmss") +".pdf",
                    //0=标准（生成的PDF图片不会模糊），1=最小的文件
                    new Variant(0)
            };
            Dispatch.invoke(excel, "ExportAsFixedFormat", Dispatch.Method, obj2, new int[1]);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (excel != null) {
                Dispatch.call(excel, "Close", new Variant(false));
            }
            if (ax != null) {
                ax.invoke("Quit", new Variant[]{});
                ax = null;
            }
            ComThread.Release();
        }
    }
}
