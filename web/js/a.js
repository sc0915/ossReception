//<script type="text/javascript">
//$(document).ready(function(){
//    $('.sb').click(function(){
//        $.ajax({
//            type: "get",
//            url: "<%=request.getContextPath()%>/product/productByType",
//            data: "typeCode=" + $(this).attr('data'),
//            contentType:"application/json",
//            success: function (data) {
//                var refreshHtml='';
//                for(var i=0;i<data.length;i++){
//                    refreshHtml+='<dl>'+
//                        '<dt><a href="<%=request.getContextPath()%>/html/inner-page.jsp" target="_new">'+
//                        '<img src="<%=request.getContextPath()%>/'+data[i].picPath+'" width="310" height="310" border="0"/></a>'+
//                        '</dt>'+
//                        '<dd>'+data[i].productName+'</dd>'+
//                        '<dd><span class="viv1">￥:'+data[i].price+'}</span><span class="viv2">'+
//                        '<a href="<%=request.getContextPath()%>/html/inner-page.jsp" target="_new">' +
//                        '<img src="<%=request.getContextPath()%>/images/vivioow_b2.jpg" width="80" height="24" border="0"/></a></span></dd>'+
//                        '</dl>';
//
//                    document.getElementById('productContent').innerHTML=refreshHtml;
//                }
//            }
//        });
//    });
//
//})
//
//</script>














//function showTips(txt,time,status)
//{
//    var htmlCon = '';
//    if(txt != ''){
//        if(status != 0 && status != undefined){
//            htmlCon = '<div class="tipsBox" style="width:220px;padding:10px;background-color:#4AAF33;border-radius:4px;-webkit-border-radius: 4px;-moz-border-radius: 4px;color:#fff;box-shadow:0 0 3px #ddd inset;-webkit-box-shadow: 0 0 3px #ddd inset;text-align:center;position:fixed;top:25%;left:50%;z-index:999999;margin-left:-120px;"><img src="${ctx}/images.png" style="vertical-align: middle;margin-right:5px;" alt="OK，"/>'+txt+'</div>';
//        }else{
//            htmlCon = '<div class="tipsBox" style="width:220px;padding:10px;background-color:#D84C31;border-radius:4px;-webkit-border-radius: 4px;-moz-border-radius: 4px;color:#fff;box-shadow:0 0 3px #ddd inset;-webkit-box-shadow: 0 0 3px #ddd inset;text-align:center;position:fixed;top:25%;left:50%;z-index:999999;margin-left:-120px;"><img src="${ctx}/images/err.png" style="vertical-align: middle;margin-right:5px;" alt="Error，"/>'+txt+'</div>';
//        }
//        $('body').prepend(htmlCon);
//        if(time == '' || time == undefined){
//            time = 1500;
//        }
//        setTimeout(function(){ $('.tipsBox').remove(); },time);
//    }
//}
//
//$(function(){
//    //AJAX提交以及验证表单
//    $('#nextBtn').click(function(){
//        var email = $('.email').val();
//        var passwd = $('.passwd').val();
//        var passwd2 = $('.passwd2').val();
//        var verifyCode = $('.verifyCode').val();
//        var EmailReg = /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/; /正则
//        if(email == ''){
//            showTips('请填写您的邮箱~');
//        }else if(!EmailReg.test(email)){
//            showTips('您的邮箱格式错咯~');
//        }else if(passwd == ''){
//            showTips('请填写您的密码~');
//        }else if(passwd2 == ''){
//            showTips('请再次输入您的密码~');
//        }else if(passwd != passwd2 || passwd2 != passwd){
//            showTips('两次密码输入不一致呢~');
//        }else if(verifyCode == ''){
//            showTips('请输入验证码~');
//        }else{
//            showTips('提交成功~ 即将进入下一步',2500,1);
//
//        }
//    });
//});

