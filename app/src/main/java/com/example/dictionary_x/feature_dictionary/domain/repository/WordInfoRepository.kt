package com.example.dictionary_x.feature_dictionary.domain.repository

import com.example.dictionary_x.core.util.Resource
import com.example.dictionary_x.feature_dictionary.domain.model.WordInfo
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {
    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>
}