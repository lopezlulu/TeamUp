package com.amazonaws.models.nosql;

import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBAttribute;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBHashKey;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBIndexHashKey;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBIndexRangeKey;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBRangeKey;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBTable;

import java.util.List;
import java.util.Map;
import java.util.Set;

@DynamoDBTable(tableName = "teamup-mobilehub-632618956-Rating")

public class RatingDO {
    private String _userId;
    private Double _skillRating;
    private Double _participationRating;
    private String _ratedByUserId;
    private String _ratingDate;
    private Double _ratingId;

    @DynamoDBHashKey(attributeName = "userId")
    @DynamoDBIndexHashKey(attributeName = "userId", globalSecondaryIndexName = "Ratings")
    public String getUserId() {
        return _userId;
    }

    public void setUserId(final String _userId) {
        this._userId = _userId;
    }
    @DynamoDBRangeKey(attributeName = "skillRating")
    @DynamoDBAttribute(attributeName = "skillRating")
    public Double getSkillRating() {
        return _skillRating;
    }

    public void setSkillRating(final Double _skillRating) {
        this._skillRating = _skillRating;
    }
    @DynamoDBIndexRangeKey(attributeName = "participationRating", globalSecondaryIndexName = "Ratings")
    public Double getParticipationRating() {
        return _participationRating;
    }

    public void setParticipationRating(final Double _participationRating) {
        this._participationRating = _participationRating;
    }
    @DynamoDBAttribute(attributeName = "ratedByUserId")
    public String getRatedByUserId() {
        return _ratedByUserId;
    }

    public void setRatedByUserId(final String _ratedByUserId) {
        this._ratedByUserId = _ratedByUserId;
    }
    @DynamoDBAttribute(attributeName = "ratingDate")
    public String getRatingDate() {
        return _ratingDate;
    }

    public void setRatingDate(final String _ratingDate) {
        this._ratingDate = _ratingDate;
    }
    @DynamoDBAttribute(attributeName = "ratingId")
    public Double getRatingId() {
        return _ratingId;
    }

    public void setRatingId(final Double _ratingId) {
        this._ratingId = _ratingId;
    }

}
