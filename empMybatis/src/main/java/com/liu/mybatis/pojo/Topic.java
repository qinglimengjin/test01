package com.liu.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Topic implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_topic.id
     *
     * @mbggenerated Tue Sep 06 08:52:02 CST 2022
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_topic.modifyTime
     *
     * @mbggenerated Tue Sep 06 08:52:02 CST 2022
     */
    private Date modifytime;

    private User user = new User();
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_topic.publishTime
     *
     * @mbggenerated Tue Sep 06 08:52:02 CST 2022
     */
    private Date publishtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_topic.title
     *
     * @mbggenerated Tue Sep 06 08:52:02 CST 2022
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_topic.sectionId
     *
     * @mbggenerated Tue Sep 06 08:52:02 CST 2022
     */
    private Integer sectionid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_topic.userId
     *
     * @mbggenerated Tue Sep 06 08:52:02 CST 2022
     */
    private Integer userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_topic.good
     *
     * @mbggenerated Tue Sep 06 08:52:02 CST 2022
     */
    private Integer good;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_topic.top
     *
     * @mbggenerated Tue Sep 06 08:52:02 CST 2022
     */
    private Integer top;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_topic.content
     *
     * @mbggenerated Tue Sep 06 08:52:02 CST 2022
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_topic
     *
     * @mbggenerated Tue Sep 06 08:52:02 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_topic.id
     *
     * @return the value of t_topic.id
     * @mbggenerated Tue Sep 06 08:52:02 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_topic.id
     *
     * @param id the value for t_topic.id
     * @mbggenerated Tue Sep 06 08:52:02 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_topic.modifyTime
     *
     * @return the value of t_topic.modifyTime
     * @mbggenerated Tue Sep 06 08:52:02 CST 2022
     */
    public Date getModifytime() {
        return modifytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_topic.modifyTime
     *
     * @param modifytime the value for t_topic.modifyTime
     * @mbggenerated Tue Sep 06 08:52:02 CST 2022
     */
    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_topic.publishTime
     *
     * @return the value of t_topic.publishTime
     * @mbggenerated Tue Sep 06 08:52:02 CST 2022
     */
    public Date getPublishtime() {
        return publishtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_topic.publishTime
     *
     * @param publishtime the value for t_topic.publishTime
     * @mbggenerated Tue Sep 06 08:52:02 CST 2022
     */
    public void setPublishtime(Date publishtime) {
        this.publishtime = publishtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_topic.title
     *
     * @return the value of t_topic.title
     * @mbggenerated Tue Sep 06 08:52:02 CST 2022
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_topic.title
     *
     * @param title the value for t_topic.title
     * @mbggenerated Tue Sep 06 08:52:02 CST 2022
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_topic.sectionId
     *
     * @return the value of t_topic.sectionId
     * @mbggenerated Tue Sep 06 08:52:02 CST 2022
     */
    public Integer getSectionid() {
        return sectionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_topic.sectionId
     *
     * @param sectionid the value for t_topic.sectionId
     * @mbggenerated Tue Sep 06 08:52:02 CST 2022
     */
    public void setSectionid(Integer sectionid) {
        this.sectionid = sectionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_topic.userId
     *
     * @return the value of t_topic.userId
     * @mbggenerated Tue Sep 06 08:52:02 CST 2022
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_topic.userId
     *
     * @param userid the value for t_topic.userId
     * @mbggenerated Tue Sep 06 08:52:02 CST 2022
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_topic.good
     *
     * @return the value of t_topic.good
     * @mbggenerated Tue Sep 06 08:52:02 CST 2022
     */
    public Integer getGood() {
        return good;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_topic.good
     *
     * @param good the value for t_topic.good
     * @mbggenerated Tue Sep 06 08:52:02 CST 2022
     */
    public void setGood(Integer good) {
        this.good = good;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_topic.top
     *
     * @return the value of t_topic.top
     * @mbggenerated Tue Sep 06 08:52:02 CST 2022
     */
    public Integer getTop() {
        return top;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_topic.top
     *
     * @param top the value for t_topic.top
     * @mbggenerated Tue Sep 06 08:52:02 CST 2022
     */
    public void setTop(Integer top) {
        this.top = top;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_topic.content
     *
     * @return the value of t_topic.content
     * @mbggenerated Tue Sep 06 08:52:02 CST 2022
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_topic.content
     *
     * @param content the value for t_topic.content
     * @mbggenerated Tue Sep 06 08:52:02 CST 2022
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_topic
     *
     * @mbggenerated Tue Sep 06 08:52:02 CST 2022
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Topic other = (Topic) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getModifytime() == null ? other.getModifytime() == null : this.getModifytime().equals(other.getModifytime()))
                && (this.getPublishtime() == null ? other.getPublishtime() == null : this.getPublishtime().equals(other.getPublishtime()))
                && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
                && (this.getSectionid() == null ? other.getSectionid() == null : this.getSectionid().equals(other.getSectionid()))
                && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
                && (this.getGood() == null ? other.getGood() == null : this.getGood().equals(other.getGood()))
                && (this.getTop() == null ? other.getTop() == null : this.getTop().equals(other.getTop()))
                && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_topic
     *
     * @mbggenerated Tue Sep 06 08:52:02 CST 2022
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getModifytime() == null) ? 0 : getModifytime().hashCode());
        result = prime * result + ((getPublishtime() == null) ? 0 : getPublishtime().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getSectionid() == null) ? 0 : getSectionid().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getGood() == null) ? 0 : getGood().hashCode());
        result = prime * result + ((getTop() == null) ? 0 : getTop().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_topic
     *
     * @mbggenerated Tue Sep 06 08:52:02 CST 2022
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", modifytime=").append(modifytime);
        sb.append(", publishtime=").append(publishtime);
        sb.append(", title=").append(title);
        sb.append(", sectionid=").append(sectionid);
        sb.append(", userid=").append(userid);
        sb.append(", good=").append(good);
        sb.append(", top=").append(top);
        sb.append(", content=").append(content);
        sb.append("]");
        return sb.toString();
    }
}