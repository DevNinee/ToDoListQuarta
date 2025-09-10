#!/bin/bash
# ===========================================
# SCRIPT DE EXECUÇÃO - SISTEMA TODOLIST
# ===========================================
# Este script executa o sistema ToDoList após verificar
# se o projeto foi compilado corretamente.
# 
# Uso: ./run.sh
# Pré-requisito: Execute ./build.sh primeiro
# ===========================================

echo "Iniciando Sistema ToDoList..."

# Verificar se o projeto foi compilado
if [ ! -d "bin" ]; then
    echo "Projeto não compilado! Execute primeiro:"
    echo "   ./build.sh"
    exit 1
fi

# Executar a aplicação
java -cp bin ucb.aplicacao.AppToDoList
