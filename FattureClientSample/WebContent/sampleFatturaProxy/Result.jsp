<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleFatturaProxyid" scope="session" class="it.alfasoft.fabrizio.FatturaProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleFatturaProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleFatturaProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleFatturaProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        it.alfasoft.fabrizio.Fattura getFattura10mtemp = sampleFatturaProxyid.getFattura();
if(getFattura10mtemp == null){
%>
<%=getFattura10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 15:
        gotMethod = true;
        it.alfasoft.fabrizio.FatturaModel[] getFatture15mtemp = sampleFatturaProxyid.getFatture();
if(getFatture15mtemp == null){
%>
<%=getFatture15mtemp %>
<%
}else{
        String tempreturnp16 = null;
        if(getFatture15mtemp != null){
        java.util.List listreturnp16= java.util.Arrays.asList(getFatture15mtemp);
        tempreturnp16 = listreturnp16.toString();
        }
        %>
        <%=tempreturnp16%>
        <%
}
break;
case 18:
        gotMethod = true;
        String codice_1id=  request.getParameter("codice27");
            java.lang.String codice_1idTemp = null;
        if(!codice_1id.equals("")){
         codice_1idTemp  = codice_1id;
        }
        it.alfasoft.fabrizio.FatturaModel getFattura18mtemp = sampleFatturaProxyid.getFattura(codice_1idTemp);
if(getFattura18mtemp == null){
%>
<%=getFattura18mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">codCliente:</TD>
<TD>
<%
if(getFattura18mtemp != null){
java.lang.String typecodCliente21 = getFattura18mtemp.getCodCliente();
        String tempResultcodCliente21 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecodCliente21));
        %>
        <%= tempResultcodCliente21 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">totale:</TD>
<TD>
<%
if(getFattura18mtemp != null){
%>
<%=getFattura18mtemp.getTotale()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">ragSociale:</TD>
<TD>
<%
if(getFattura18mtemp != null){
java.lang.String typeragSociale25 = getFattura18mtemp.getRagSociale();
        String tempResultragSociale25 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeragSociale25));
        %>
        <%= tempResultragSociale25 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>