package com.haochen.competitionbrain.bean;

import java.util.List;

/**
 * Created by Haochen on 2016/12/29.
 */
public class Competition extends Bean {
    protected String name;
    protected int rule;
    protected List<Module> modules;
    protected List<Competitor> competitors;
}