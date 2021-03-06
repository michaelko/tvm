/* Generated by ./dump_config. Do not modify. */
#ifndef _PLATFORM_CONFIG_H
#define _PLATFORM_CONFIG_H

#include <stdio.h>
typedef unsigned char byte;
typedef signed char JBYTE;
typedef signed short JSHORT;
typedef signed long JINT;
typedef unsigned short TWOBYTES;
typedef unsigned long FOURBYTES;
#include "systime.h"
#define ptr2word(PTR_) ((STACKWORD) (PTR_))
#define word2ptr(WRD_) ((void *) (WRD_))
#define get_sys_time() get_sys_time_impl()
#ifndef LITTLE_ENDIAN
#define LITTLE_ENDIAN 1
#endif
#define FP_ARITHMETIC 1
#define PLATFORM_HANDLES_SWITCH_THREAD 0
#define TICKS_PER_TIME_SLICE          140 // Actually instructions per timeslice
#define VERIFY
#define RECORD_REFERENCES 1

#endif // _PLATFORM_CONFIG_H
