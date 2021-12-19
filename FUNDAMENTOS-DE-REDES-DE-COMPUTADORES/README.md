# MAPA - FUNDAMENTOS DE REDES DE COMPUTADORES - UNICESUMAR

Após uma empresa que atua no ramo de planos de saúde sofrer um ataque gravíssimo de ransomware, fui convocado para reconstruir a rede interna da empresa, de acordo com análise, foi identificado que o ataque se originou de um acesso vindo do setor comercial.<br />

De acordo com as informações, vou reconstruir a rede isolando os setores da empresa em VLANs, aplicando as devidas separações de estações, como também propor novas medidas de segurança. <br />

Vejamos a seguir algumas informações da empresa:<br />

## Administrativo, Comercial,  Financeiro e Atendimento
> **Administrativo:** Servidor de ERP1, Servidor de E-mail1<br />
> **Comercial:** Servidor de DHCP para o comercial, Servidor de Intranet 1<br />
> **Financeiro:** Servidor de Intranet 2<br />
> **Atendimento:** Servidor de DHCP para o atendimento<br />


## Configuração da rede 
- Criar os servidores e departamentos, sendo que cada departamento deverá ter no mínimo 5 computadores.
- Criar 4 VLans em todos os Switchs
- Configurar todos os computadores e servidores.

![estrutura](https://user-images.githubusercontent.com/88719652/146685342-e6db8643-4a8f-45b4-802e-148df204a5bf.png)
![ping](https://user-images.githubusercontent.com/88719652/146618568-5b95d601-f4a0-4c1a-8867-e0e1e6483da6.png)

## Configuração do Servidor de DNS (INTRANET 1, INTRANET 2)
O principal objetivo de um servidor de DNS é trabalhar com nomes em vez dos IPs para acessar endereço.<br />

![DHCP](https://user-images.githubusercontent.com/88719652/146618579-5b4508ac-9da8-4fda-9241-d7e966ca6f3b.png)

## Configurar arquivos no Servidor WEB 
Nos servidores de intranet podemos ter diversos serviços disponíveis, como por exemplo, um servidor Web que é um dos principais componentes para aplicações WEB. <br />

![DNS](https://user-images.githubusercontent.com/88719652/146618583-8e2fbb3f-7762-49f4-99ea-9b57558377f5.png)


https://user-images.githubusercontent.com/88719652/146688887-ec502d77-c3a7-4e63-9e1a-b7979c533395.mp4






