<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <% 
   request.setAttribute("ctxpath", request.getContextPath());
 %>  
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>音乐系统</title>
<link href="${ctxpath}/static/themes/default/style.css" rel="stylesheet" type="text/css" media="screen"/>
<link href="${ctxpath}/static/themes/css/core.css" rel="stylesheet" type="text/css" media="screen"/>
<link href="${ctxpath}/static/themes/css/print.css" rel="stylesheet" type="text/css" media="print"/>
<!--[if IE]>
<link href="${ctxpath}/static/themes/css/ieHack.css" rel="stylesheet" type="text/css" media="screen"/>
<![endif]-->
<!--[if lt IE 9]>
<script src="${ctxpath}/static/js/speedup.js" type="text/javascript"></script>
<script src="${ctxpath}/static/js/jquery-1.11.3.min.js" type="text/javascript"></script>
<![endif]-->
<!--[if gte IE 9]><!-->
<script src="${ctxpath}/static/js/jquery-2.1.4.min.js" type="text/javascript"></script>
<!--<![endif]-->
<script src="${ctxpath}/static/js/jquery.cookie.js" type="text/javascript"></script>
<script src="${ctxpath}/static/js/jquery.validate.js" type="text/javascript"></script>
<script src="${ctxpath}/static/js/dwz.min.js" type="text/javascript"></script>
<script src="${ctxpath}/static/js/dwz.regional.zh.js" type="text/javascript"></script>