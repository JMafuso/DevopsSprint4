package br.com.fiap.ja.odontoprev.config;

import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.ai.chat.memory.InMemoryChatMemory;
import org.springframework.ai.embedding.EmbeddingModel;
import org.springframework.ai.vectorstore.SimpleVectorStore;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AiConfig {
    @Bean
    VectorStore vectors(EmbeddingModel model) {
        return new SimpleVectorStore(model);
    }

    @Bean
    ChatMemory memory() {
        return new InMemoryChatMemory();
    };
}
