#include <jni.h>
#include <stdlib.h>
#include <time.h>

extern "C"
JNIEXPORT jint JNICALL
Java_id_ac_ui_cs_mobileprogramming_dimasaditya_ninjaapp_MainActivity_generateNumber(JNIEnv *env,
                                                                                    jobject thiz) {
    // TODO: implement generateNumber()
    srand((unsigned int) time(0));
    int intrandom = (rand() % (9999 - 1019));
    return intrandom;
}