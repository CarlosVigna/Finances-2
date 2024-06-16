// Script para adicionar dinamicamente os últimos lançamentos
document.addEventListener('DOMContentLoaded', function () {
    // Exemplo de dados (pode ser substituído por dados reais)
    const ultimosLancamentosData = [
        { data: '2024-02-07', descricao: 'Conta de Luz', valor: 100.00, status: 'Paga' },
        { data: '2024-02-06', descricao: 'Aluguel', valor: 1200.00, status: 'Pendente' },
        { data: '2024-02-05', descricao: 'Supermercado', valor: 150.00, status: 'Paga' },
    ];

    const ultimosLancamentosList = document.getElementById('ultimos-lancamentos');

    // Adicionar cada lançamento à lista
    ultimosLancamentosData.forEach(lancamento => {
        const listItem = document.createElement('li');
        listItem.classList.add('list-group-item');
        listItem.innerHTML = `
            <div class="d-flex w-100 justify-content-between">
                <h5 class="mb-1">${lancamento.descricao}</h5>
                <small>${lancamento.data}</small>
            </div>
            <p class="mb-1">Valor: R$ ${lancamento.valor.toFixed(2)} - Status: ${lancamento.status}</p>
        `;
        ultimosLancamentosList.appendChild(listItem);
    });
});
