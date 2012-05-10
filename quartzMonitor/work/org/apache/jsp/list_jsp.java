package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=urf-8\">\r\n");
      out.write("        <title>调度任务列表</title>\r\n");
      out.write("        <style type=\"text/css\">@import url('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/styles/home.css');\r\n");
      out.write("        </style>\r\n");
      out.write("\t\t <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/components/jquery/jquery-1.3.2.min.js\">\r\n");
      out.write("        </script>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tfunction doCmd(state,triggerName,group,triggerState){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(state == 'pause' && triggerState=='PAUSED'){\r\n");
      out.write("\t\t\t\talert(\"该Trigger己经暂停！\");\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t    if(state == 'resume' && triggerState != 'PAUSED'){\r\n");
      out.write("\t\t\t\talert(\"该Trigger正在运行中！\");\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//客户端两次编码，服务端再解码，否测中文乱码 \r\n");
      out.write("\t\t\ttriggerName = encodeURIComponent(encodeURIComponent(triggerName));\r\n");
      out.write("\t\t\tgroup = encodeURIComponent(encodeURIComponent(group));\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/JobProcessServlet?jobtype=200&action='+state+'&triggerName='+triggerName+'&group='+group,\r\n");
      out.write("                type: 'post',\r\n");
      out.write("                //dataType: 'xml',\r\n");
      out.write("               // timeout: 3000,\r\n");
      out.write("                error: function(){\r\n");
      out.write("                   alert(\"执行失败！\");\t\t\r\n");
      out.write("                },\r\n");
      out.write("                success: function(xml){\r\n");
      out.write("\t\t\t\t\tif (xml == 0) {\r\n");
      out.write("\t\t\t\t\t\talert(\"执行成功！\");\r\n");
      out.write("\t\t\t\t\t\twindow.location.reload();\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\talert(\"执行失败！\");\t\r\n");
      out.write("\t\t\t\t\t}\t\t   \r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("    \t<br><br>\r\n");
      out.write("        <p>\r\n");
      out.write("            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/index.jsp\">添加调度任务</a>\r\n");
      out.write("        </p>\r\n");
      out.write("        <table  border=\"1\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th nowrap>\r\n");
      out.write("                    Trigger 名称\r\n");
      out.write("                </th>\r\n");
      out.write("                <th nowrap>\r\n");
      out.write("                    Trigger 分组\r\n");
      out.write("                </th>\r\n");
      out.write("                <th nowrap>\r\n");
      out.write("                    下次执行时间\r\n");
      out.write("                </th>\r\n");
      out.write("                <th nowrap>\r\n");
      out.write("                    上次执行时间\r\n");
      out.write("                </th>\r\n");
      out.write("                <th nowrap>\r\n");
      out.write("                    优先级\r\n");
      out.write("                </th>\r\n");
      out.write("                <th nowrap>\r\n");
      out.write("                    Trigger 状态\r\n");
      out.write("                </th>\r\n");
      out.write("                <th nowrap>\r\n");
      out.write("                    Trigger 类型\r\n");
      out.write("                </th>\r\n");
      out.write("                <th nowrap>\r\n");
      out.write("                    开始时间\r\n");
      out.write("                </th>\r\n");
      out.write("                <th nowrap>\r\n");
      out.write("                    结束时间\r\n");
      out.write("                </th>\r\n");
      out.write("                <th nowrap>\r\n");
      out.write("                    动作命令\r\n");
      out.write("                </th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /list.jsp(89,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("map");
    // /list.jsp(89,12) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                <tr>\r\n");
          out.write("                    <td nowrap>\r\n");
          out.write("                    \t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map.display_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("                    </td>\r\n");
          out.write("                    <td nowrap>\r\n");
          out.write("                    \t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map.trigger_group}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("                    </td>\r\n");
          out.write("                    <td nowrap>\r\n");
          out.write("                    \t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map.next_fire_time}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("                    </td>\r\n");
          out.write("                    <td nowrap>\r\n");
          out.write("                    \t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map.prev_fire_time}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("                    </td>\r\n");
          out.write("                    <td nowrap>\r\n");
          out.write("                    \t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map.priority}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("                    </td>\r\n");
          out.write("                    <td nowrap>\r\n");
          out.write("                    \t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map.statu}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("                    </td>\r\n");
          out.write("                    <td nowrap>\r\n");
          out.write("                    \t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map.trigger_type}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("                    </td>\r\n");
          out.write("                    <td nowrap>\r\n");
          out.write("                    \t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map.start_time}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("                    </td>\r\n");
          out.write("                    <td nowrap>\r\n");
          out.write("                    \t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map.end_time}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("                    </td>\r\n");
          out.write("                    <td nowrap>\r\n");
          out.write("                    \t<input type=\"button\" id=\"pause\" value=\"暂停\" onclick=\"doCmd('pause','");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map.trigger_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('\'');
          out.write(',');
          out.write('\'');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map.trigger_group}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('\'');
          out.write(',');
          out.write('\'');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map.trigger_state}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("')\">\r\n");
          out.write("\t\t\t\t\t\t<input type=\"button\" id=\"resume\" value=\"恢复\" onclick=\"doCmd('resume','");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map.trigger_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('\'');
          out.write(',');
          out.write('\'');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map.trigger_group}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('\'');
          out.write(',');
          out.write('\'');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map.trigger_state}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("')\">\r\n");
          out.write("\t\t\t\t\t\t<input type=\"button\" id=\"remove\" value=\"删除\" onclick=\"doCmd('remove','");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map.trigger_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('\'');
          out.write(',');
          out.write('\'');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map.trigger_group}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('\'');
          out.write(',');
          out.write('\'');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map.trigger_state}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("')\">\t\t\t\t\t\t\r\n");
          out.write("                    </td>\r\n");
          out.write("                </tr>\r\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
