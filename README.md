# Spring AI - Parallelization Workflow Pattern

This repository demonstrates the **Spring AI Parallelization Workflow Pattern**, a powerful technique for executing multiple independent LLM tasks concurrently to improve throughput and efficiency in your Java applications.

📖 **Dive Deeper**: For a complete walkthrough, detailed explanations of the Parallelization Workflow pattern, and step-by-step instructions for the example application, read our blog post.<br>
👉 [Spring AI Parallelization Workflow: Efficient Concurrent LLM Processing](https://bootcamptoprod.com/spring-ai-parallelization-workflow-guide/)

---

## 📦 Environment Variables

Make sure to provide these Java environment variables when running the application:

- `GEMINI_API_KEY`: Your Google Gemini API key.

---

## About This Project

This project implements a **News Summarization System** as a real-world example of the Spring AI Parallelization Workflow. It showcases how to:

*   Set up a Spring Boot application with Spring AI.
*   Configure Spring AI to use Google Gemini (or other LLMs).
*   Implement the `ParallelizationWorkflow` to process multiple news articles concurrently.
*   Send multiple independent summarization requests to an LLM in parallel.
*   Aggregate the results.
*   Use Logbook to observe and verify parallel HTTP calls to the LLM.