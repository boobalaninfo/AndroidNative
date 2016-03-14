#include <jni.h>
#include <string.h>
#include <android/log.h>

jint Java_com_bob_androidnative_MainActivity_add (JNIEnv * env, jobject obj, jint a, jint b)
{
	return (int)a+(int)b;
}

jint Java_com_bob_androidnative_MainActivity_sub (JNIEnv * env, jobject obj, jint a, jint b)
{
	return (int)a-(int)b;
}

jint Java_com_bob_androidnative_MainActivity_mul (JNIEnv * env, jobject obj, jint a, jint b)
{
	return (int)a*(int)b;
}

jint Java_com_bob_androidnative_MainActivity_div (JNIEnv * env, jobject obj, jint a, jint b)
{
	return (int)a/(int)b;
}

