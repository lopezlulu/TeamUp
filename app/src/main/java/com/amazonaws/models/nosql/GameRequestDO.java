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

@DynamoDBTable(tableName = "teamup-mobilehub-632618956-GameRequest")

public class GameRequestDO {
    private String _userId;
    private String _requestId;
    private String _address;
    private String _city;
    private String _endDate;
    private Double _latitude;
    private String _level;
    private Double _longitude;
    private Double _radius;
    private String _sport;
    private String _startDate;
    private String _state;
    private String _zipCode;

    @DynamoDBHashKey(attributeName = "userId")
    @DynamoDBAttribute(attributeName = "userId")
    public String getUserId() {
        return _userId;
    }

    public void setUserId(final String _userId) {
        this._userId = _userId;
    }
    @DynamoDBRangeKey(attributeName = "RequestId")
    @DynamoDBAttribute(attributeName = "RequestId")
    public String getRequestId() {
        return _requestId;
    }

    public void setRequestId(final String _requestId) {
        this._requestId = _requestId;
    }
    @DynamoDBAttribute(attributeName = "Address")
    public String getAddress() {
        return _address;
    }

    public void setAddress(final String _address) {
        this._address = _address;
    }
    @DynamoDBAttribute(attributeName = "City")
    public String getCity() {
        return _city;
    }

    public void setCity(final String _city) {
        this._city = _city;
    }
    @DynamoDBIndexRangeKey(attributeName = "EndDate", globalSecondaryIndexName = "Sport-EndDate")
    public String getEndDate() {
        return _endDate;
    }

    public void setEndDate(final String _endDate) {
        this._endDate = _endDate;
    }
    @DynamoDBAttribute(attributeName = "Latitude")
    public Double getLatitude() {
        return _latitude;
    }

    public void setLatitude(final Double _latitude) {
        this._latitude = _latitude;
    }
    @DynamoDBAttribute(attributeName = "Level")
    public String getLevel() {
        return _level;
    }

    public void setLevel(final String _level) {
        this._level = _level;
    }
    @DynamoDBAttribute(attributeName = "Longitude")
    public Double getLongitude() {
        return _longitude;
    }

    public void setLongitude(final Double _longitude) {
        this._longitude = _longitude;
    }
    @DynamoDBAttribute(attributeName = "Radius")
    public Double getRadius() {
        return _radius;
    }

    public void setRadius(final Double _radius) {
        this._radius = _radius;
    }
    @DynamoDBIndexHashKey(attributeName = "Sport", globalSecondaryIndexNames = {"Sport-ZipCode","Sport-StartDate","Sport-EndDate",})
    public String getSport() {
        return _sport;
    }

    public void setSport(final String _sport) {
        this._sport = _sport;
    }
    @DynamoDBIndexRangeKey(attributeName = "StartDate", globalSecondaryIndexName = "Sport-StartDate")
    public String getStartDate() {
        return _startDate;
    }

    public void setStartDate(final String _startDate) {
        this._startDate = _startDate;
    }
    @DynamoDBAttribute(attributeName = "State")
    public String getState() {
        return _state;
    }

    public void setState(final String _state) {
        this._state = _state;
    }
    @DynamoDBIndexRangeKey(attributeName = "ZipCode", globalSecondaryIndexName = "Sport-ZipCode")
    public String getZipCode() {
        return _zipCode;
    }

    public void setZipCode(final String _zipCode) {
        this._zipCode = _zipCode;
    }

}
