#include <jni.h>
#include <string>

// JNI names follow: Java_<package_with_underscores>_<Class>_<method>

extern "C" JNIEXPORT jstring JNICALL
Java_com_example_rbxlayer_MainActivity_stringFromJNI(JNIEnv *env, jobject /* this */) {
    std::string hello = "Hello from C++! The native layer is alive.";
    return env->NewStringUTF(hello.c_str());
}

extern "C" JNIEXPORT jint JNICALL
Java_com_example_rbxlayer_MainActivity_add(JNIEnv * /* env */, jobject /* this */, jint a, jint b) {
    return a + b;
}
