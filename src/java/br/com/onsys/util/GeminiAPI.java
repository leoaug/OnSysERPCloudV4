/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.onsys.util;

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
//import com.google.api.client.json.jackson2.JacksonFactory;
//import com.google.api.services.generativeai.v1beta.GenerativeAi;
//import com.google.api.services.generativeai.v1beta.model.GenerateTextRequest;
//import com.google.api.services.generativeai.v1beta.model.GenerateTextResponse;

import java.io.IOException;
import java.security.GeneralSecurityException;


public class GeminiAPI {
/*
    private static final String API_KEY = "YOUR_API_KEY"; // Substitua com sua chave da API do Google Cloud
    private static final String MODEL = "text-bison@001"; // Modelo Gemini

    public String consultarGemini(String frase) throws GeneralSecurityException, IOException {
        // Crie a instância do serviço GenerativeAi
        GenerativeAi service = new GenerativeAi.Builder(
                GoogleNetHttpTransport.newTrustedTransport(),
                JacksonFactory.getDefaultInstance(),
                null)
                .setApplicationName("gemini-api-example")
                .build();

        // Crie a requisição GenerateTextRequest
        GenerateTextRequest request = new GenerateTextRequest()
                .setModel(MODEL)
                .setPrompt(frase);

        // Execute a requisição e obtenha a resposta
        GenerateTextResponse response = service.projects().locations().models().generateText(
                "projects/YOUR_PROJECT_ID/locations/global/models/text-bison@001", request)
                .execute();

        // Retorna a resposta gerada pelo modelo
        return response.getResults().get(0).getContent();
    }

*/
}
