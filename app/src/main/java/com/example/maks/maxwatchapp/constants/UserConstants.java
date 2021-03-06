package com.example.maks.maxwatchapp.constants;

import com.example.maks.maxwatchapp.BuildConfig;

/**
 * Created by Maks on 24/06/17.
 */

public class UserConstants {
    public final static String usersUrl = BaseUrl.getInstance().getBaseUrl() + "/api/v1/users";
    public final static String postMessageUrl = BaseUrl.getInstance().getBaseUrl() + "/api/v1/users/message";
    public final static String getMessagesUrl = BaseUrl.getInstance().getBaseUrl() + "/api/v1/users/messages";
    public final static String putGpsLocation = BaseUrl.getInstance().getBaseUrl() + "/api/v1/users/position";
}
