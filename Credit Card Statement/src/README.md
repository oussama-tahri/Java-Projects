                          -- Read a credit card CSV statement --
                          
        Creating a balance variable that calculates the running balance of the user’s account
        If the field says CREDIT, then add the amount to the balance
        If the field says DEBIT, then subtract the amount to the balance
        If the final amount is greater than zero, charge a 10% fee and warn the user
        If the final amount is zero, thank the user for their payments
        If the final amount is less than zero, thank the user for their payment and display their overpayment.
        Use this data for your test, or generate your own:
        Sep02,credit,CostCo,342.23
        Sep09,Credit,ATT,93.42
        Sep10,CREDIT,Applebees,56.20
        Sep11,CREDIT,AppleStore,995.95
        Sep12,DEBIT,ACHPayment,500
        Sep19,CREDIT,Speedway,35.09
        Sep20,CREDIT,McDonalds,12.55
        Sep21,DEBIT,ACHPayment,600
        Sep26,DEBIT,ACHPayment,250
        Sep30,FEE,MasterCard,2.50 
