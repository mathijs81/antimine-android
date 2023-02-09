-keepattributes Exceptions, InnerClasses

-keep class com.crashlytics.** { *; }
-dontwarn com.crashlytics.**

-keep class dev.lucasnlm.antimine.common.level.database.*
-keep class dev.lucasnlm.antimine.common.level.database.** { *; }
-keep class dev.lucasnlm.antimine.common.level.database.converters.** { *; }
-keep class dev.lucasnlm.antimine.common.level.database.dao.** { *; }
-keep class androidx.room.** { *; }

-keep class * implements android.os.Parcelable {
   public static final android.os.Parcelable$Creator *;
}

-keepclassmembers @com.squareup.moshi.JsonClass class * extends java.lang.Enum {
    <fields>;
    **[] values();
}

-dontwarn org.conscrypt.**
-dontwarn org.bouncycastle.**
-dontwarn org.openjsse.**
