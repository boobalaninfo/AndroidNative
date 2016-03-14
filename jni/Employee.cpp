#include <jni.h>
#include <stdio.h>

class Calculator
{
private:
	int a;
	int b;

public:
	Calculator(int value1, int value2);
	int add();
	int sub();
	 int mul();
	 int div() ;
};

	Calculator::Calculator(int value1, int value2){
		a = value1;
		b = value2;
	}

	int Calculator::add(){
		return a+b;
	}

	 int Calculator::sub(){
		return a-b;
	}

	 int Calculator::mul() {
		return a*b;
	}

	 int Calculator::div() {
		return a/b;
	}


extern "C" {


JNIEXPORT jint Java_com_bob_androidnative_MainActivity_add(JNIEnv * env, jobject obj, jint a, jint b);
JNIEXPORT jint Java_com_bob_androidnative_MainActivity_sub(JNIEnv * env, jobject obj, jint a, jint b);
JNIEXPORT jint Java_com_bob_androidnative_MainActivity_mul(JNIEnv * env, jobject obj, jint a, jint b);
JNIEXPORT jint Java_com_bob_androidnative_MainActivity_div(JNIEnv * env, jobject obj, jint a, jint b);



	JNIEXPORT jint Java_com_bob_androidnative_MainActivity_add(JNIEnv * env, jobject obj, jint a, jint b){
			Calculator calc = Calculator(a,b);
			return calc.add();
	}
	JNIEXPORT jint Java_com_bob_androidnative_MainActivity_sub(JNIEnv * env, jobject obj, jint a, jint b){
				Calculator calc = Calculator(a,b);
				return calc.sub();
		}
	JNIEXPORT jint Java_com_bob_androidnative_MainActivity_mul(JNIEnv * env, jobject obj, jint a, jint b){
				Calculator calc = Calculator(a,b);
				return calc.mul();
		}
	JNIEXPORT jint Java_com_bob_androidnative_MainActivity_div(JNIEnv * env, jobject obj, jint a, jint b){
				Calculator calc = Calculator(a,b);
				return calc.div();
		}

}
