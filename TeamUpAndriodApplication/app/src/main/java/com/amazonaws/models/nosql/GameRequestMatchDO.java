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

@DynamoDBTable(tableName = "teamup-mobilehub-632618956-GameRequestMatch")

public class GameRequestMatchDO {
    private String _userId;
    private String _acceptOrDecline;
    private String _gameRequestMatchId;
    private String _opponentResponse;
    private String _opponentUserId;
    private String _requestId;

    @DynamoDBHashKey(attributeName = "userId")
    @DynamoDBIndexRangeKey(attributeName = "userId", globalSecondaryIndexName = "RequestId-Action")
    public String getUserId() {
        return _userId;
    }

    public void setUserId(final String _userId) {
        this._userId = _userId;
    }
    @DynamoDBAttribute(attributeName = "AcceptOrDecline")
    public String getAcceptOrDecline() {
        return _acceptOrDecline;
    }

    public void setAcceptOrDecline(final String _acceptOrDecline) {
        this._acceptOrDecline = _acceptOrDecline;
    }
    @DynamoDBAttribute(attributeName = "GameRequestMatchId")
    public String getGameRequestMatchId() {
        return _gameRequestMatchId;
    }

    public void setGameRequestMatchId(final String _gameRequestMatchId) {
        this._gameRequestMatchId = _gameRequestMatchId;
    }
    @DynamoDBAttribute(attributeName = "OpponentResponse")
    public String getOpponentResponse() {
        return _opponentResponse;
    }

    public void setOpponentResponse(final String _opponentResponse) {
        this._opponentResponse = _opponentResponse;
    }
    @DynamoDBAttribute(attributeName = "OpponentUserId")
    public String getOpponentUserId() {
        return _opponentUserId;
    }

    public void setOpponentUserId(final String _opponentUserId) {
        this._opponentUserId = _opponentUserId;
    }
    @DynamoDBIndexHashKey(attributeName = "RequestId", globalSecondaryIndexName = "RequestId-Action")
    public String getRequestId() {
        return _requestId;
    }

    public void setRequestId(final String _requestId) {
        this._requestId = _requestId;
    }

}
