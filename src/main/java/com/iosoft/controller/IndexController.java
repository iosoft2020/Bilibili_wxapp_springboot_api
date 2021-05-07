package com.iosoft.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iosoft.pojo.Swiper;
import com.iosoft.pojo.Video;

@RestController
public class IndexController {

    @GetMapping("/getNavs")
    public ResponseEntity<Map<String, List<String>>> getNavs() {
        return ResponseEntity.status(HttpStatus.OK).body(
                Collections.singletonMap("navs", Arrays.asList("首页", "动画",
                        "番剧",
                        "音乐",
                        "国创",
                        "舞蹈",
                        "游戏",
                        "知识",
                        "数码",
                        "生活",
                        "鬼畜",
                        "时尚",
                        "资讯",
                        "娱乐",
                        "影视",
                        "放映厅",
                        "更多",
                        "专栏",
                        "直播",
                        "活动",
                        "课堂",
                        "小黑屋")));
    }

    @GetMapping("/getSwipers")
    public ResponseEntity<Map<String, List<Swiper>>> getSwipers() {
        return ResponseEntity.status(HttpStatus.OK).body(
                Collections.singletonMap("swipers",
                        Arrays.asList(new Swiper(
                                "https://i0.hdslb.com/bfs/feed-admin/f2ead9211c00daa7e9df4164e308672758c1f414.jpg@880w_388h_1c_95q"),
                                new Swiper(
                                        "https://i0.hdslb.com/bfs/feed-admin/75b273f86fd10d2eff10fdd5d4b82fa1a7659c92.jpg@880w_388h_1c_95q"),
                                new Swiper(
                                        "https://i0.hdslb.com/bfs/sycp/creative_img/202104/cff327b0fcf25107f1dcbc06ee57da24.jpg@880w_388h_1c_95q"),
                                new Swiper(
                                        "https://i0.hdslb.com/bfs/feed-admin/97ea0c6422c8a32fb107b212abaf99ff188f40a4.jpg@880w_388h_1c_95q"),
                                new Swiper(
                                        "https://i0.hdslb.com/bfs/feed-admin/0bf0258be3bb20f7ede83f95d57fc4a0e801a006.jpg@880w_388h_1c_95q"))));
    }

    @GetMapping("/getVideos")
    public ResponseEntity<Map<String, List<Video>>> getVideos() {
        return ResponseEntity.status(HttpStatus.OK).body(
                Collections.singletonMap("videos",
                        Arrays.asList(new Video(1,
                                "https://i0.hdslb.com/bfs/feed-admin/f2ead9211c00daa7e9df4164e308672758c1f414.jpg@880w_388h_1c_95q",
                                "testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest",
                                500, 11, null, null),
                                new Video(2,
                                        "https://i0.hdslb.com/bfs/feed-admin/75b273f86fd10d2eff10fdd5d4b82fa1a7659c92.jpg@880w_388h_1c_95q",
                                        "testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest",
                                        600, 22, null, null),
                                new Video(3,
                                        "https://i0.hdslb.com/bfs/sycp/creative_img/202104/cff327b0fcf25107f1dcbc06ee57da24.jpg@880w_388h_1c_95q",
                                        "testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest",
                                        700, 33, null, null),
                                new Video(4,
                                        "https://i0.hdslb.com/bfs/feed-admin/97ea0c6422c8a32fb107b212abaf99ff188f40a4.jpg@880w_388h_1c_95q",
                                        "testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest",
                                        800, 44, null, null),
                                new Video(5,
                                        "https://i0.hdslb.com/bfs/feed-admin/0bf0258be3bb20f7ede83f95d57fc4a0e801a006.jpg@880w_388h_1c_95q",
                                        "testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest",
                                        900, 55, null, null))));
    }
}
