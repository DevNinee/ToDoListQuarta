#!/bin/bash

echo "🚀 Executando ToDoList..."

# Verificar se o projeto foi compilado
if [ ! -d "bin" ]; then
    echo "❌ Projeto não compilado! Execute primeiro:"
    echo "   ./build.sh"
    exit 1
fi

# Executar a aplicação
java -cp bin ucb.aplicacao.AppToDoList
