LOCAL_PATH	:= $(call my-dir)

include $(CLEAR_VARS)
LOCAL_LDLIBS	:= -llog
LOCAL_MODULE	:= calc
LOCAL_SRC_FILES	:= Employee.cpp
include $(BUILD_SHARED_LIBRARY)
 