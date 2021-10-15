package dataFactory;

import pojo.UsuarioPojo;

public class UsuarioDataFactory
{
    public static UsuarioPojo criarUsuarioAdministrador()
    {
        UsuarioPojo usuario = new UsuarioPojo();
        usuario.setUsuarioLogin("jason");
        usuario.setUsuarioSenha("jason");

        return usuario;
    }
}
