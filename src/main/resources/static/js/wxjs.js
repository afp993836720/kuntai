function is_weixin() {

    var ua = navigator.userAgent.toLowerCase();
    if((ua.match(/MicroMessenger/i) == "micromessenger") ){
        return true;
    } else {
        return false;
    }
}
var isWeixin = is_weixin();
var winHeight = typeof window.innerHeight != 'undefined' ? window.innerHeight : document.documentElement.clientHeight;
function loadHtml(){
    var div = document.createElement('div');
    // var div =$('div');
    div.id = 'weixin-tip';
    div.innerHTML = '<p><img src="img/live_weixin.png" style="max-width: 100%; height: auto;" alt="微信打开"/></p>';
    document.body.appendChild(div);
    // $('body').append(div);
}

function loadStyleText(cssText) {
    var style = document.createElement('style');
    style.rel = 'stylesheet';
    style.type = 'text/css';
    try {
        style.appendChild(document.createTextNode(cssText));
    } catch (e) {
        style.styleSheet.cssText = cssText; //ie9以下
    }
    var head=document.getElementsByTagName("head")[0]; //head标签之间加上style样式
    head.appendChild(style);
}
var cssText = "#weixin-tip{position: fixed; left:0; top:0; background: rgba(0,0,0,0.8); filter:alpha(opacity=80); width: 100%; height:100%; z-index: 100;} #weixin-tip p{text-align: center; margin-top: 10%; padding:0 5%;}";
// function page_wx_load(){
//     if(isWeixin){
//         loadHtml();
//         loadStyleText(cssText);
//     }
// }
//
// window.load =page_wx_load();

$(function () {
     if(isWeixin){
        loadHtml();
        loadStyleText(cssText);
    }
})