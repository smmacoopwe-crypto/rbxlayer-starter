cmake_minimum_required(VERSION 3.22.1)

project("rbxlayer")

add_library(rbxlayer SHARED native-lib.cpp)

find_library(log-lib log)

target_link_libraries(rbxlayer ${log-lib})
