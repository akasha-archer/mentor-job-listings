package com.example.joblistings.data

data class JobNetworkModel(
    val id: Int,
    val company: String,
    val logo: String,
    val new: Boolean,
    val featured: Boolean,
    val position: String,
    val role: String,
    val level: String,
    val postedAt: String,
    val contract: String,
    val location: String,
    val languages: List<String>,
    val tools: List<String>
)
