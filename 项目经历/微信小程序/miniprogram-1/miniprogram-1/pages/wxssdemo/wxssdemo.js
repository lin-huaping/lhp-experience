// pages/wxssdemo/wxssdemo.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    dotscontroll:false,
    time:3000,
    time:200,
    tag:false,
utl1:"https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fa4.att.hudong.com%2F27%2F67%2F01300000921826141299672233506.jpg&refer=http%3A%2F%2Fa4.att.hudong.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1612513991&t=af3ffd8d3fc0d7f0ddbd3e015e17fa4e",
utl2:"https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fa4.att.hudong.com%2F27%2F67%2F01300000921826141299672233506.jpg&refer=http%3A%2F%2Fa4.att.hudong.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1612513991&t=af3ffd8d3fc0d7f0ddbd3e015e17fa4e",
utl3:"https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fa4.att.hudong.com%2F27%2F67%2F01300000921826141299672233506.jpg&refer=http%3A%2F%2Fa4.att.hudong.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1612513991&t=af3ffd8d3fc0d7f0ddbd3e015e17fa4e",
imgurlist:[
  "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fa4.att.hudong.com%2F27%2F67%2F01300000921826141299672233506.jpg&refer=http%3A%2F%2Fa4.att.hudong.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1612513991&t=af3ffd8d3fc0d7f0ddbd3e015e17fa4e","https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fa4.att.hudong.com%2F27%2F67%2F01300000921826141299672233506.jpg&refer=http%3A%2F%2Fa4.att.hudong.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1612513991&t=af3ffd8d3fc0d7f0ddbd3e015e17fa4e",
  "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fa4.att.hudong.com%2F27%2F67%2F01300000921826141299672233506.jpg&refer=http%3A%2F%2Fa4.att.hudong.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1612513991&t=af3ffd8d3fc0d7f0ddbd3e015e17fa4e"
]
  },
  swiperchange:function(e){
    console.log(e)
    let item=this.data.dotscontroll;
    this.setData({
      dotscontroll:!item
    })
  },
  swiperchange2:function(e){
    console.log(e)
    let item=this.data.tag;
    this.setData({
      tag:!item
    })
  },
  changeslider:function(e){
    console.log(e)
    this.setData({
     time: e.detail.value
    })
  },
  changeslider2:function(e){
    console.log(e)
    this.setData({
     time2: e.detail.value
    })
  },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {

  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  }
})