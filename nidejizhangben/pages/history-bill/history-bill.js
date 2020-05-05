var util = require('../../utils/util.js')
var startD="";
var endD="";
Page({
  data:{
    startdDate:"2017-04-23",
    endDate:"2017-04-23",
    historyBillList:[],
    scrollHeight:"100%",
  },
  bindStartDateChange:function(e){
    this.startD = e.detail.value;
    let json =
    {
      start: this.startD,
      end: this.endD,
      openId: wx.getStorageSync("openid"),
    };
   
    // 页面显示
    let slef = this;
    util.HttpGet(
      "/account/history",
      json,
      function (data) {
        slef.setData({
          startdDate: slef.startD,
          historyBillList: data,
        });
      }
    );
  },
  bindEndDateChange: function (e) {
    this.endD = e.detail.value;
    let json =
    {
      start: this.startD,
      end: this.endD,
      openId: wx.getStorageSync("openid"),
    };
   
    // 页面显示
    let slef = this;
    util.HttpGet(
      "/account/history",
      json,
      function (data) {
        slef.setData({
          endDate: slef.endD,
          historyBillList: data,
        });
      }
    );
  },
  onLoad:function(options){
    // 页面初始化 options为页面跳转所带来的参数

  },
  onReady:function(){
    // 页面渲染完成
  },
  onShow:function(){
    const todayDate = util.formatTime(new Date(), "yyyy-MM-dd");
    console.log(todayDate);
    let json =
    {
      start: todayDate,
      end: todayDate,
      openId: wx.getStorageSync("openid"),
    };
    this.startD = todayDate;
    this.endD = todayDate;
    console.log(util.json2Form(json));
    // 页面显示
    let slef = this;
    util.HttpGet(
      "/account/history",
      json,
      function (data) {
        slef.setData({
          startdDate: todayDate,
          endDate: todayDate,
          historyBillList: data,
        });
      }
    );
  },
  onHide:function(){
    // 页面隐藏
  },
  onUnload:function(){
    // 页面关闭
  }
})