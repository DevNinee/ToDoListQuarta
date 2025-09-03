#!/bin/bash

echo "🔨 Compilando projeto ToDoList..."

# Criar diretório bin se não existir
mkdir -p bin

# Compilar todos os arquivos Java
javac -d bin src/ucb/**/*.java

if [ $? -eq 0 ]; then
    echo "✅ Compilação realizada com sucesso!"
    echo ""
    echo "🚀 Para executar o projeto, use:"
    echo "   java -cp bin ucb.aplicacao.AppToDoList"
    echo ""
    echo "🎯 Ou execute diretamente:"
    echo "   ./run.sh"
else
    echo "❌ Erro na compilação!"
    exit 1
fi
