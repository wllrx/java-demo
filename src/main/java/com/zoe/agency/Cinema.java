package com.zoe.agency;

/**
 * @Author zoe
 **/
public class Cinema implements Movie {

    private RealMovie realMovie;
    public Cinema(RealMovie realMovie){
        super();
        this.realMovie = realMovie;
    }

    @Override
    public void play() {
        advertising(true);
        realMovie.play();
        advertising(false);
    }
    public void advertising(boolean isStart){
        if (isStart){
            System.out.println("电影开始播放前.....");
        }
        else {
            System.out.println("电影结束播放后.....");
        }

    }
}
