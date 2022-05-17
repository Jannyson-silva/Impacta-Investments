package br.com.lab.impacta.investment.integration.impl;

import br.com.lab.impacta.investment.infrastructure.http.AccountClient;
import br.com.lab.impacta.investment.integration.AccountIntegration;
import br.com.lab.impacta.investment.integration.valueObject.AccountBalanceVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AccountIntegrationImpl implements AccountIntegration {

    private final AccountClient accountClient;

    @Override
    public AccountBalanceVO getAccountBalanceById(Long accountId) {
        AccountBalanceVO accountBalanceVO = accountClient.getAccountBalance(accountId);

        return accountBalanceVO;
    }
}
