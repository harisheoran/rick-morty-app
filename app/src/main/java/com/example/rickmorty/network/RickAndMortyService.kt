package com.example.rickmorty.network

import com.example.rickmorty.network.response.GetCharactersPageResponse
import com.example.rickmorty.network.response.GetCharacterByIdResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface RickAndMortyService {
    @GET("character/{character-id}")
    suspend fun getCharacterById(@Path(value = "character-id") characterId: Int): Response<GetCharacterByIdResponse>

    @GET(value = "character")
    suspend fun getCharactersPage(@Query(value = "page") pageIndex: Int): Response<GetCharactersPageResponse>
}