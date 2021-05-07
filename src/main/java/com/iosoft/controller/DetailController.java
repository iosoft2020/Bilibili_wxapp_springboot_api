package com.iosoft.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.iosoft.pojo.Comment;
import com.iosoft.pojo.Recommended;
import com.iosoft.pojo.Video;

@RestController
public class DetailController {

    @GetMapping("/getVideo/{id}")
    public ResponseEntity<Map<String, Video>> getVideos(@PathVariable("id") Integer id) {
        return ResponseEntity.status(HttpStatus.OK).body(
                Collections.singletonMap("videoDetails",
                        new Video(5,
                                "https://i0.hdslb.com/bfs/feed-admin/0bf0258be3bb20f7ede83f95d57fc4a0e801a006.jpg@880w_388h_1c_95q",
                                "testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest",
                                900, 55,
                                "https://www.bilibili.com/video/BV1EK4y1A7wM?spm_id_from=333.851.b_7265706f7274466972737432.6",
                                "dafasfasdfasdfasd")));
    }

    @GetMapping("/getRecommendedVideos/{id}")
    public ResponseEntity<Map<String, List<Recommended>>> getRecommendedVideos(@PathVariable("id") Integer id) {
        return ResponseEntity.status(HttpStatus.OK).body(
                Collections.singletonMap("recommendedVideos",
                        Arrays.asList(new Recommended(
                                "https://i0.hdslb.com/bfs/feed-admin/f2ead9211c00daa7e9df4164e308672758c1f414.jpg@880w_388h_1c_95q",
                                "testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest",
                                500, 11),
                                new Recommended(
                                        "https://i0.hdslb.com/bfs/feed-admin/75b273f86fd10d2eff10fdd5d4b82fa1a7659c92.jpg@880w_388h_1c_95q",
                                        "testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest",
                                        600, 22),
                                new Recommended(
                                        "https://i0.hdslb.com/bfs/sycp/creative_img/202104/cff327b0fcf25107f1dcbc06ee57da24.jpg@880w_388h_1c_95q",
                                        "testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest",
                                        700, 33),
                                new Recommended(
                                        "https://i0.hdslb.com/bfs/feed-admin/97ea0c6422c8a32fb107b212abaf99ff188f40a4.jpg@880w_388h_1c_95q",
                                        "testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest",
                                        800, 44),
                                new Recommended(
                                        "https://i0.hdslb.com/bfs/feed-admin/0bf0258be3bb20f7ede83f95d57fc4a0e801a006.jpg@880w_388h_1c_95q",
                                        "testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest",
                                        900, 55))));
    }

    @GetMapping("/getVideosComments/{id}")
    public ResponseEntity<Map<String, Object>> getVideosComments(@PathVariable("id") Integer id) {

        Map<String, Object> result = new HashMap<>();
        result.put("videoCommentCount", 666);
        result.put("videoComments",
                Arrays.asList(new Comment(
                        "testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest",
                        "2021/5/6", "hello",
                        "https://i0.hdslb.com/bfs/feed-admin/f2ead9211c00daa7e9df4164e308672758c1f414.jpg@880w_388h_1c_95q"),
                        new Comment(
                                "testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest",
                                "2021/5/7", "world",
                                "https://i0.hdslb.com/bfs/feed-admin/0bf0258be3bb20f7ede83f95d57fc4a0e801a006.jpg@880w_388h_1c_95q"),
                        new Comment(
                                "testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest",
                                "2021/5/8", "hello world",
                                "https://i0.hdslb.com/bfs/feed-admin/75b273f86fd10d2eff10fdd5d4b82fa1a7659c92.jpg@880w_388h_1c_95q")));
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
