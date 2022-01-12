package com.example.trackingusageapps;
/**
 * Create Abbas Mohammadi at 01.01.2022
 */

public class AppVariable {
    //-----------------------------------------------------------------------------------------------------------
    //                               General app tracking day use
    //-----------------------------------------------------------------------------------------------------------
//Variable General app tracking day use ----- GeneralAppInfo_ mean: Gneral App Information
    public String mGeneralAppInfo_Name;
    public String mGeneralAppInfo_PackageName;
    public int mGeneralAppInfo_Count;
    public boolean mGeneralAppInfo_CanOpen;
    private boolean mGeneralAppInfo_IsSystem;
    public String mGeneralAppInfo_Category;                 // Category of App like Productivity or Social etc.

    public long mGeneralAppInfo_EventTime;					 // Date of Activity App
    public long mGeneralAppInfo_TotalUsageTime;				 // Tottal Usage Time of App in Day
    public long mGeneralAppInfo_TotalWifiNetworkData;        // WIFI Network data transfer in day
    public long mGeneralAppInfo_TotalMobileNetworkData;      // Cellular data transfer in day
    public String mGeneralAppInfo_GeneralNetworkType;        // Network Type like 2G,3G,4G or 5G in day
    public int mGeneralAppInfo_BatteryUsage;                 // Battery Usage of App in Day
    public int mGeneralAppInfo_BatteryAction;                // Battery Action: Charge or Discharge
    public long mGeneralAppInfo_BatteryCapacity;             // Battery Capacity
    public long mGeneralAppInfo_BatteryVoltage;              // Battery Voltage

    //-----------------------------------------------------------------------------------------------------------
    //                                  Any time of use of the app tracking
    //-----------------------------------------------------------------------------------------------------------
//Variable Any time of use of the app tracking ----- EachAppInfo_ mean: Each App Information
    public String mEachAppInfo_Name;
    public String mEachAppInfo_PackageName;
    public int mEachAppInfo_Count;
    public boolean mEachAppInfo_CanOpen;
    private boolean mEachAppInfo_IsSystem;
    public String mEachAppInfo_Category;                     // Category of App like Productivity or Social etc.

    public long mEachAppInfo_OpenEventDate;                  // Date at Start and Close the App
    public long mEachAppInfo_TimeStampOpen;                  // TimeStamp at start
    public long mEachAppInfo_TimeStampClose;                 // TimeStamp at close
    public long mEachAppInfo_UsageTime;	                     // Total usage time
    public long mEachAppInfo_WifiNetworkData;                // WIFI Network data transfer
    public long mEachAppInfo_MobileNetworkData;              // Cellular data transfer
    public String mEachAppInfo_NetworkType;                  // Network Type like 2G,3G,4G or 5G
    public int mEachAppInfo_BatteryAction;               	 // Battery Action: Charge or Discharge
    public int mEachAppInfo_BatteryUsage;                    // Battery Usage of App in Act
    public long mEachAppInfo_BatteryCapacity;                // Battery Capacity
    public long mEachAppInfo_BatteryVoltage;                 // Battery Voltage



}
