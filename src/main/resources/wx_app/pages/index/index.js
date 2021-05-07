Page({

  /**
   * 页面的初始数据
   */
  data: {
    // 菜单被点击时的index
    currentIndexNav: 0,
    // 首页导航
    navs: [],
    // 轮播图数据
    swipers: [],
    // 视频列表数据
    videos: []
  },
  /**
   * 获取首页导航数据
   */
  getNavs() {
    let that = this;
    wx.request({
      url: 'http://localhost:8080/getNavs',
      success(res) {
        if (res.statusCode === 200) {
          that.setData({
            navs: res.data.navs
          })
        }
      }
    })
  },
  /**
   * 获取轮播图数据
   */
  getSwipers() {
    let that = this;
    wx.request({
      url: 'http://localhost:8080/getSwipers',
      success(res) {
        if (res.statusCode === 200) {
          that.setData({
            swipers: res.data.swipers
          })
        }
      }
    })
  },
  /**
   * 获取视频列表数据
   */
  getVideos() {
    let that = this;
    wx.request({
      url: 'http://localhost:8080/getVideos',
      success(res) {
        if (res.statusCode === 200) {
          that.setData({
            videos: res.data.videos
          })
        }
      }
    })
  },
  /**
   * 菜单点击切换后，设置active边框
   */
  activeNav(e) {
    this.setData({
      currentIndexNav: e.target.dataset.index
    })
  },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    this.getNavs();
    this.getSwipers();
    this.getVideos();
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