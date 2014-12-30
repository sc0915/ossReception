<%@ page import="com.shinowit.model.TbaMemberinfo" %>
<%--
  Created by IntelliJ IDEA.
  User: SC
  Date: 2014/12/24
  Time: 20:52
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html; charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>果果首页</title>
    <%@ include file="/common/commonhead.jsp" %>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.9.1.js"></script>
    <link href="<%=request.getContextPath()%>/page/css/style.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="<%=request.getContextPath()%>/page/jquery.paginate.js"></script>


    <script type="text/javascript">
        $(document).ready(function () {
            $('.mername').click(function () {
                $.ajax({
                    type: "get",
                    url: "<%=request.getContextPath()%>/merchandiseinfo/dispalymerchandiseinfo",
                    data: "merchandisecid=" + $(this).attr('data'),
                    contentType: "application/json",
                    success: function (data) {
                        var refreshHtml = '';
                        for (var i = 0; i < data.length; i++) {
                            refreshHtml += '<dl>' +
                                    '<dt><a href="<%=request.getContextPath()%>/inner/dispalyinner/'+data[i].MerchandiseID+'" target="_new">' +
                                    '<img src="<%=request.getContextPath()%>/images/T1.jpg" width="310" height="310" border="0"/></a>' +
                                    '</dt>' +
                                    '<dd>' + data[i].MerchandiseName + '</dd>' +
                                    '<dd><span class="viv1">￥:' + data[i].Price + '</span><span class="viv2">' +
                                    '<a href="<%=request.getContextPath()%>/inner/dispalyinner/'+data[i].MerchandiseID+'" target="_new">' +
                                    '<img src="<%=request.getContextPath()%>/images/vivioow_b2.jpg" width="80" height="24" border="0"/></a></span></dd>' +
                                    '</dl>';
                        }
                        document.getElementById('hostid').innerHTML = refreshHtml;
                    }
                });
            });
        });

    </script>

    <script type="text/javascript">
        $(document).ready(function () {
            $('.proname').click(function () {
                $.ajax({
                    type: "get",
                    url: "<%=request.getContextPath()%>/merchandiseinfo/prostauts",
                    data: "prostatusid=" + $(this).attr('prodata'),
                    contentType: "application/json",
                    success: function (data) {
                        var refreshHtml = '';
                        for (var i = 0; i < data.length; i++) {
                            refreshHtml += '<dl>' +
                                    '<dt><a href="<%=request.getContextPath()%>/inner/dispalyinner/'+data[i].MerchandiseID+'" target="_new">' +
                                    '<img src="<%=request.getContextPath()%>/images/T1.jpg" width="310" height="310" border="0"/></a>' +
                                    '</dt>' +
                                    '<dd>' + data[i].MerchandiseName + '</dd>' +
                                    '<dd><span class="viv1">￥:' + data[i].Price + '</span><span class="viv2">' +
                                    '<a href="<%=request.getContextPath()%>/inner/dispalyinner/'+data[i].MerchandiseID+'" target="_new"">' +
                                    '<img src="<%=request.getContextPath()%>/images/vivioow_b2.jpg" width="80" height="24" border="0"/></a></span></dd>' +
                                    '</dl>';
                        }
                        document.getElementById('hostid').innerHTML = refreshHtml;
                    }
                });
            });
        });
    </script>


    <script type="text/javascript">

        //分页
        $(function() {
            $("#demo1").paginate({
                count 		: $(".countpage").val(),
                start 		: $(".page_id").val(),
                display     : 20,
                border					: true,
                border_color			: '#fff',
                text_color  			: '#fff',
                background_color    	: 'black',
                border_hover_color		: '#ccc',
                text_hover_color  		: '#000',
                background_hover_color	: '#fff',
                images					: false,
                mouse					: 'slide',
                onChange:function(page){
                    location.href="<%=request.getContextPath()%>/merchand/dispalymerchand?pageid="+page;
                }
            });
        });

    </script>




</head>

<body>
<input type="hidden" class="countpage" value="${countnum}"/>
<input type="hidden" class="page_id" name="pageid" value="${pageid}" />
<div id="box">
    <!--top start -->
    <div id="top">
        <a href="<%=request.getContextPath()%>/merchand/dispalymerchand"><img
                src="<%=request.getContextPath()%>/images/logo.gif" alt="Estimation" width="255" height="58" border="0"
                class="logo"/></a>

        <p class="topDiv"></p>

        <p class="navLeft"></p>
        <ul>
            <li><a href="<%=request.getContextPath()%>/merchand/dispalymerchand" class="hover">首页</a></li>
            <li><a href="#">关于我们</a></li>
            <li><a href="#">在线客服</a></li>
            <li class="chart"><a href="<%=request.getContextPath()%>/chart/dischart">购物车</a></li>
        </ul>
        <p class="navRight"></p>

        <p class="topDiv"></p>

        <form name="serch" action="#" method="post">
            <input type="text" name="txtbox" value="购物搜索" class="txtBox"/>
            <input type="submit" name="go" value="搜" class="go"/>
        </form>
    </div>
    <!--top end -->
    <!--header start -->
    <div id="header">
        <!--nav start -->
        <div class="nav">
            <ul>
                <li class="first"><a href="#">新品上架</a></li>
                <li><a href="#">坚果炒货</a></li>
                <li><a href="#">补血大枣</a></li>
                <li><a href="#">经典肉类</a></li>
                <li><a href="#">进口零食</a></li>
                <li><a href="#">美味糖果</a></li>
                <li><a href="#">天然干果</a></li>
                <li><a href="#">蒙古奶酪</a></li>
                <li><a href="#">台湾牛轧糖</a></li>
                <li><a href="#">蜜饯果脯</a></li>
                <li class="last">
                    <div id="welcome" class="welmsgdiv2"><span>您好，欢迎光临果果香。
                </span>
                        <c:if test="${loginsession==null}">
                        <a href="<%=request.getContextPath()%>/index/log">登录</a>
                        </c:if>
                        <c:if test="${loginsession!=null}">
                            <%TbaMemberinfo str=(TbaMemberinfo)request.getSession().getAttribute("loginsession");%>
                            <%=str.getUsername()%>
                        </c:if>
                    <span class="Lloginfg">&nbsp;
                    </span>
                        <a href="<%=request.getContextPath()%>/index/userreg">注册</a>
                    </div>
                </li>
            </ul>
        </div>
        <!--nav end -->
        <div class="spacer"></div>
    </div>
    <!--header end -->
    <!--guide01 start -->
    <div class="guide01">
        <img src="<%=request.getContextPath()%>/images/guide_01.jpg" width="973" height="62" border="0" usemap="#Map"/>
        <map name="Map" id="Map">
            <area shape="rect" coords="398,11,493,51" href="#"/>
            <area shape="rect" coords="540,12,633,51" href="#"/>
            <area shape="rect" coords="684,12,790,53" href="#"/>
            <area shape="rect" coords="830,10,953,54" href="#"/>
        </map>
    </div>
    <!--guide01 end -->
    <!--guide02 start-->
    <div class="guide02"><a href="#"><img src="<%=request.getContextPath()%>/images/guide_02.jpg" width="492"
                                          height="107" border="0"/></a><a href="#"><img
            src="<%=request.getContextPath()%>/images/guide_03.jpg" width="481" height="107" border="0"/></a></div>
    <!--guide02 end -->
    <!--recommend start-->
    <div class="recommend">
        <h2>推荐美国山核桃长寿果 大杏仁 15.8/半斤 奶香味</h2>

        <p><img src="<%=request.getContextPath()%>/images/coma.gif" width="15" height="12" style="margin-right:12px;"/>山核桃,又名胡桃、马核桃、核桃楸果,是乔木核桃楸的种子。山核桃营养丰富,价值很高,是一种优质木本高级油料作物。此外,还含锌、锰、铬等微量元素与尼克酸等。<img
                src="<%=request.getContextPath()%>/images/coma_inverse.gif" width="15" height="12"
                style="margin-left:12px;"/></p>
    </div>
    <!--recommend end-->
    <!--body start -->
    <div id="body">
        <!--leftMain start -->
        <div id="leftMain">
            <!--left start -->
            <div id="left">
                <h2>商品分类</h2>
                <ul>
                    <c:forEach items="${merlist}" var="mer">
                        <li><a class="mername" data="${mer.merchandisecid}">${mer.merchandisecname}</a></li>
                    </c:forEach>
                </ul>
                <h2 class="detail">商品状态</h2>
                <ul class="leftLink">
                    <c:forEach items="${prolist}" var="pro">
                        <li><a class="proname" prodata="${pro.prostatusid}">${pro.prostatusname}</a></li>
                    </c:forEach>
                </ul>
                <br class="spacer"/>
<span style="color:#f9c441;">ssss<br/>
ssssssssss<br/>
</span>
            </div>
            <!--left end -->
        </div>
        <!--leftMain end -->
        <!--mid start -->
        <div id="mid">
            <h2>新品上市</h2>
            <!--hotsale_ad start -->
            <div class="hotsale_ad"><img src="<%=request.getContextPath()%>/images/pic1.jpg" width="780" height="274"/>
            </div>
            <!--hotsale_ad end -->
            <!--hotsale start -->
            <div class="hotsale" id="hostid">
                <c:forEach items="${merchandlist}" var="merchand">
                    <dl>
                        <dt><a href="<%=request.getContextPath()%>/inner/dispalyinner/${merchand.merchandiseid}" target="_new"><img
                                src="<%=request.getContextPath()%>/images/T1.jpg" width="310" height="310" border="0"/></a>
                        </dt>
                        <dd>${merchand.merchandisename}</dd>
                        <dd><span class="viv1">￥:${merchand.price}</span><span class="viv2"><a href="<%=request.getContextPath()%>/inner/dispalyinner/${merchand.merchandiseid}"
                                                                                               target="_new"><img
      2                          src="<%=request.getContextPath()%>/images/vivioow_b2.jpg" width="80" height="24"
                                border="0"/></a></span></dd>
                    </dl>
                </c:forEach>
                <br class="spacer"/>
                <div id="demo1" style="height: 60px; text-align: center;"></div>
            </div>
            <!--hotsale end -->
        </div>
        <!--mid end -->
        <br class="spacer"/>
    </div>
    <!--footer start -->
    <div id="footer">
        <ul>
            <li><a href="#">首页</a>|</li>
            <li><a href="#">关于我们</a>|</li>
            <li><a href="#">新闻资讯</a>|</li>
            <li><a href="#">价单下载</a>|</li>
            <li><a href="#">联系我们</a>|</li>
        </ul>
        <p class="copyright">Copyright 2010 vancl.com All Rights Reserved 冀ICP证xxxxxx号

        </p>

        <p class="design"><a href="http://www.CSSK8.com/" target="_blank" class="link">启奥科技</a></p>
    </div>
    <!--footer end -->
    <!--body end -->
</div>
<!--box-->
</body>
</html>
