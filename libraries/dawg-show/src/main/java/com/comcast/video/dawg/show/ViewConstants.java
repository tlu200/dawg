/**
 * Copyright 2010 Comcast Cable Communications Management, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.comcast.video.dawg.show;

/**
 * Holds constants for UI views
 *
 * @author Kevin Pearson
 *
 */
public interface ViewConstants {
    /** View Names */
    public static final String STB = "stb";
    public static final String SIMPLIFIED = "simplified";
    public static final String MULTI = "multi";
    public static final String NOSTB = "nostb";
    public static final String COMPARE_NOT_FOUND = "compareNotFound";
    public static final String META = "meta";
    public static final String BROWSERNOTSUPPORTED = "bns";
    public static final String SNAPPEDIMAGE = "snappedImage";
    public static final String SNAP_DOWNLOAD = "multiSnapDownloadManager";
    public static final String REMOTE_PLUGIN = "remote-plugin";
    public static final String PLUGIN_CONFIG = "plugin-config";

    /** View parameters */
    public static final String DEVICE_ID = "deviceId";
    public static final String STBS = "stbs";
    public static final String MODEL = "model";
    public static final String IPADDRESS = "ipAddress";
    public static final String STB_PARAM = "stb";
    public static final String REMOTE_MANAGER = "remoteManager";
    public static final String REMOTE = "remote";
    public static final String REMOTE_TYPES = "remoteTypes";
    public static final String SELECTED_REMOTE_TYPE = "selectedRemoteType";
    public static final String MOBILE = "mobile";
    public static final String VIDEO_URL = "videoUrl";
    public static final String VIDEO_CAMERA = "videoCamera";
    public static final String VIDEO_AVAILABLE = "videoAvailable";
    public static final String HD_VIDEO_URL = "hdVideoUrl";
    public static final String IR_AVAILABLE = "irAvailable";
    public static final String TRACE_AVAILABLE = "traceAvailable";
    public static final String TRACE_HOST = "traceHost";
    public static final String SUPPORTED = "supported";
    public static final String AUDIO_URL_OGG = "audioUrl_ogg";
    public static final String AUDIO_URL_MPEG = "audioUrl_mpeg";
    /** Represent generic remote keys */
    public static final String GENERIC_REMOTE_KEYS = "genericRemoteKeys";
    /** Represent map of image id with corresponding snapshot id */
    public static final String DEVICEID_IMAGEID_MAP = "deviceIdImageIdMap";
    public static final String STB_URLS = "urls";
    public static final String STB_URLS_AUDIO_OGG = "audio_ogg";
    public static final String STB_URLS_AUDIO_MPEG = "audio_mpeg";
    public static final String STB_URLS_VIDEO = "video";

    public static final String IMAGE_CACHE = "imageCache";
}
