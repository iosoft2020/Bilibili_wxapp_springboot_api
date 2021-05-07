// pages/detail/detail.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    videoDetails: null,
    recommendedVideos: null,
    videoCommentCount: 0,
    videoComments: null
  },
  /**
   * 根据id获取当前播放视频数据
   */
  getCurrentVideo(videoId){
    let that = this;
    wx.request({
      //url: 'http://localhost:8080/getVideo/'+videoId,
      url: 'http://localhost:8080/getVideo/1',
      success(res) {
        if (res.statusCode === 200) {
          that.setData({
            videoDetails: res.data.videoDetails
          })
        }
      }
    })
  },
/**
   * 根据id获取推荐视频数据
   */
  getRecommendedVideos(videoId){
    let that = this;
    wx.request({
      //url: 'http://localhost:8080/getRecommendedVideos/'+videoId,
      url: 'http://localhost:8080/getRecommendedVideos/1',
      success(res) {
        if (res.statusCode === 200) {
          that.setData({
            recommendedVideos: res.data.recommendedVideos
          })
        }
      }
    })
  },
  /**
   * 根据id获取视频留言数据
   */
  getVideoComments(videoId){
    let that = this;
    wx.request({
      //url: 'http://localhost:8080/getVideosComments/'+videoId,
      url: 'http://localhost:8080/getVideosComments/1',
      success(res) {
        if (res.statusCode === 200) {
          that.setData({
            videoComments: res.data.videoComments,
            videoCommentCount: res.data.videoCommentCount
          })
        }
      }
    })
  },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    let videoId = options.id;
    this.getCurrentVideo(videoId);
    this.getRecommendedVideos(videoId);
    this.getVideoComments(videoId);
    
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