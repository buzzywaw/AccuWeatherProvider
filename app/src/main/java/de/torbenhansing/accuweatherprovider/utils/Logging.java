/*
 *  Copyright (C) 2016 The CyanogenMod Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.torbenhansing.accuweatherprovider.utils;

import android.util.Log;

public class Logging {
    private static final String TAG = "AccuWeatherProvider";

    public static void logd(String log) {
        Log.d(TAG, log);
    }

    public static void logw(String log) {
        Log.w(TAG, log);
    }

    public static void loge(String log) {
        //This is an actual error, so it might be important, no check for debug flag
        Log.e(TAG, log);
    }
}
