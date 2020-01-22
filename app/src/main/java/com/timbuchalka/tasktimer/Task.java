package com.timbuchalka.tasktimer;

import java.io.Serializable;

/**
 * Created by timbuchalka on 28/11/16.
 */

class Task implements Serializable {
    public static final long serialVersionUID = 20161120L;

    private long m_Id;
    private final String mName;
    private final String mDescription;
    private final int mSortOrder;

    public Task(long id, String name, String description, int sortOrder) {
        this.m_Id = id;
        mName = name;
        mDescription = description;
        mSortOrder = sortOrder;
    }

    long getId() {
        return m_Id;
    }

    String getName() {
        return mName;
    }

    String getDescription() {
        return mDescription;
    }

    int getSortOrder() {
        return mSortOrder;
    }

    void setId(long id) {
        this.m_Id = id;
    }

    @Override
    public String toString() {
        return "Task{" +
                "m_Id=" + m_Id +
                ", mName='" + mName + '\'' +
                ", mDescription='" + mDescription + '\'' +
                ", mSortOrder=" + mSortOrder +
                '}';
    }
}
