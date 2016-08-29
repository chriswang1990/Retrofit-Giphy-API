package com.example.chriswang.retrofitgiphyapi;

import java.util.List;

public class GiphyResponse {

    /**
     * type : gif
     * id : YP8B7Pepxq5nW
     * slug : todd-margaret-YP8B7Pepxq5nW
     * url : http://giphy.com/gifs/todd-margaret-YP8B7Pepxq5nW
     * bitly_gif_url : http://gph.is/29owxce
     * bitly_url : http://gph.is/29owxce
     * embed_url : http://giphy.com/embed/YP8B7Pepxq5nW
     * username :
     * source : http://ultragrrrl.blogspot.com/2010/12/keywords.html
     * rating :
     * content_url :
     * source_tld : ultragrrrl.blogspot.com
     * source_post_url : http://ultragrrrl.blogspot.com/2010/12/keywords.html
     * is_indexable : 0
     * import_datetime : 2016-07-09 08:25:50
     * trending_datetime : 0000-00-00 00:00:00
     * images : {"fixed_height":{"url":"http://media4.giphy.com/media/YP8B7Pepxq5nW/200.gif","width":"270","height":"200","size":"1013873","mp4":"http://media4.giphy.com/media/YP8B7Pepxq5nW/200.mp4","mp4_size":"109277","webp":"http://media4.giphy.com/media/YP8B7Pepxq5nW/200.webp","webp_size":"363536"},"fixed_height_still":{"url":"http://media4.giphy.com/media/YP8B7Pepxq5nW/200_s.gif","width":"270","height":"200"},"fixed_height_downsampled":{"url":"http://media4.giphy.com/media/YP8B7Pepxq5nW/200_d.gif","width":"270","height":"200","size":"148192","webp":"http://media4.giphy.com/media/YP8B7Pepxq5nW/200_d.webp","webp_size":"47744"},"fixed_width":{"url":"http://media4.giphy.com/media/YP8B7Pepxq5nW/200w.gif","width":"200","height":"148","size":"546451","mp4":"http://media4.giphy.com/media/YP8B7Pepxq5nW/200w.mp4","mp4_size":"73982","webp":"http://media4.giphy.com/media/YP8B7Pepxq5nW/200w.webp","webp_size":"221856"},"fixed_width_still":{"url":"http://media4.giphy.com/media/YP8B7Pepxq5nW/200w_s.gif","width":"200","height":"148"},"fixed_width_downsampled":{"url":"http://media4.giphy.com/media/YP8B7Pepxq5nW/200w_d.gif","width":"200","height":"148","size":"80239","webp":"http://media4.giphy.com/media/YP8B7Pepxq5nW/200w_d.webp","webp_size":"28680"},"fixed_height_small":{"url":"http://media4.giphy.com/media/YP8B7Pepxq5nW/100.gif","width":"135","height":"100","size":"289531","mp4":"http://media4.giphy.com/media/YP8B7Pepxq5nW/100.mp4","mp4_size":"42352","webp":"http://media4.giphy.com/media/YP8B7Pepxq5nW/100.webp","webp_size":"125558"},"fixed_height_small_still":{"url":"http://media4.giphy.com/media/YP8B7Pepxq5nW/100_s.gif","width":"135","height":"100"},"fixed_width_small":{"url":"http://media4.giphy.com/media/YP8B7Pepxq5nW/100w.gif","width":"100","height":"74","size":"171016","mp4":"http://media4.giphy.com/media/YP8B7Pepxq5nW/100w.mp4","mp4_size":"28254","webp":"http://media4.giphy.com/media/YP8B7Pepxq5nW/100w.webp","webp_size":"80394"},"fixed_width_small_still":{"url":"http://media4.giphy.com/media/YP8B7Pepxq5nW/100w_s.gif","width":"100","height":"74"},"downsized":{"url":"http://media.giphy.com/media/YP8B7Pepxq5nW/giphy-tumblr.gif","width":"250","height":"185","size":"855107"},"downsized_still":{"url":"http://media.giphy.com/media/YP8B7Pepxq5nW/giphy-tumblr_s.gif","width":"250","height":"185"},"downsized_large":{"url":"http://media4.giphy.com/media/YP8B7Pepxq5nW/giphy.gif","width":"379","height":"281","size":"2102730"},"downsized_medium":{"url":"http://media4.giphy.com/media/YP8B7Pepxq5nW/giphy.gif","width":"379","height":"281","size":"2102730"},"original":{"url":"http://media4.giphy.com/media/YP8B7Pepxq5nW/giphy.gif","width":"379","height":"281","size":"2102730","frames":"44","mp4":"http://media4.giphy.com/media/YP8B7Pepxq5nW/giphy.mp4","mp4_size":"318688","webp":"http://media4.giphy.com/media/YP8B7Pepxq5nW/giphy.webp","webp_size":"702364"},"original_still":{"url":"http://media4.giphy.com/media/YP8B7Pepxq5nW/giphy_s.gif","width":"379","height":"281"},"looping":{"mp4":"http://media.giphy.com/media/YP8B7Pepxq5nW/giphy-loop.mp4"}}
     */

    private List<DataBean> data;

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * fixed_height : {"url":"http://media4.giphy.com/media/YP8B7Pepxq5nW/200.gif","width":"270","height":"200","size":"1013873","mp4":"http://media4.giphy.com/media/YP8B7Pepxq5nW/200.mp4","mp4_size":"109277","webp":"http://media4.giphy.com/media/YP8B7Pepxq5nW/200.webp","webp_size":"363536"}
         * fixed_height_still : {"url":"http://media4.giphy.com/media/YP8B7Pepxq5nW/200_s.gif","width":"270","height":"200"}
         * fixed_height_downsampled : {"url":"http://media4.giphy.com/media/YP8B7Pepxq5nW/200_d.gif","width":"270","height":"200","size":"148192","webp":"http://media4.giphy.com/media/YP8B7Pepxq5nW/200_d.webp","webp_size":"47744"}
         * fixed_width : {"url":"http://media4.giphy.com/media/YP8B7Pepxq5nW/200w.gif","width":"200","height":"148","size":"546451","mp4":"http://media4.giphy.com/media/YP8B7Pepxq5nW/200w.mp4","mp4_size":"73982","webp":"http://media4.giphy.com/media/YP8B7Pepxq5nW/200w.webp","webp_size":"221856"}
         * fixed_width_still : {"url":"http://media4.giphy.com/media/YP8B7Pepxq5nW/200w_s.gif","width":"200","height":"148"}
         * fixed_width_downsampled : {"url":"http://media4.giphy.com/media/YP8B7Pepxq5nW/200w_d.gif","width":"200","height":"148","size":"80239","webp":"http://media4.giphy.com/media/YP8B7Pepxq5nW/200w_d.webp","webp_size":"28680"}
         * fixed_height_small : {"url":"http://media4.giphy.com/media/YP8B7Pepxq5nW/100.gif","width":"135","height":"100","size":"289531","mp4":"http://media4.giphy.com/media/YP8B7Pepxq5nW/100.mp4","mp4_size":"42352","webp":"http://media4.giphy.com/media/YP8B7Pepxq5nW/100.webp","webp_size":"125558"}
         * fixed_height_small_still : {"url":"http://media4.giphy.com/media/YP8B7Pepxq5nW/100_s.gif","width":"135","height":"100"}
         * fixed_width_small : {"url":"http://media4.giphy.com/media/YP8B7Pepxq5nW/100w.gif","width":"100","height":"74","size":"171016","mp4":"http://media4.giphy.com/media/YP8B7Pepxq5nW/100w.mp4","mp4_size":"28254","webp":"http://media4.giphy.com/media/YP8B7Pepxq5nW/100w.webp","webp_size":"80394"}
         * fixed_width_small_still : {"url":"http://media4.giphy.com/media/YP8B7Pepxq5nW/100w_s.gif","width":"100","height":"74"}
         * downsized : {"url":"http://media.giphy.com/media/YP8B7Pepxq5nW/giphy-tumblr.gif","width":"250","height":"185","size":"855107"}
         * downsized_still : {"url":"http://media.giphy.com/media/YP8B7Pepxq5nW/giphy-tumblr_s.gif","width":"250","height":"185"}
         * downsized_large : {"url":"http://media4.giphy.com/media/YP8B7Pepxq5nW/giphy.gif","width":"379","height":"281","size":"2102730"}
         * downsized_medium : {"url":"http://media4.giphy.com/media/YP8B7Pepxq5nW/giphy.gif","width":"379","height":"281","size":"2102730"}
         * original : {"url":"http://media4.giphy.com/media/YP8B7Pepxq5nW/giphy.gif","width":"379","height":"281","size":"2102730","frames":"44","mp4":"http://media4.giphy.com/media/YP8B7Pepxq5nW/giphy.mp4","mp4_size":"318688","webp":"http://media4.giphy.com/media/YP8B7Pepxq5nW/giphy.webp","webp_size":"702364"}
         * original_still : {"url":"http://media4.giphy.com/media/YP8B7Pepxq5nW/giphy_s.gif","width":"379","height":"281"}
         * looping : {"mp4":"http://media.giphy.com/media/YP8B7Pepxq5nW/giphy-loop.mp4"}
         */

        private ImagesBean images;

        public ImagesBean getImages() {
            return images;
        }

        public void setImages(ImagesBean images) {
            this.images = images;
        }

        public static class ImagesBean {
            /**
             * url : http://media4.giphy.com/media/YP8B7Pepxq5nW/200.gif
             * width : 270
             * height : 200
             * size : 1013873
             * mp4 : http://media4.giphy.com/media/YP8B7Pepxq5nW/200.mp4
             * mp4_size : 109277
             * webp : http://media4.giphy.com/media/YP8B7Pepxq5nW/200.webp
             * webp_size : 363536
             */

            private FixedHeightBean fixed_height;

            public FixedHeightBean getFixed_height() {
                return fixed_height;
            }

            public void setFixed_height(FixedHeightBean fixed_height) {
                this.fixed_height = fixed_height;
            }

            public static class FixedHeightBean {
                private String url;

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }
    }
}
