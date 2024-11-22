package org.fstt.lsi.demo.ma.fstt.servlet;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.fstt.lsi.demo.ma.fstt.entities.Client;
import org.fstt.lsi.demo.ma.fstt.service.ClientService;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/client")
public class ClientServlet extends HttpServlet { // Extend HttpServlet
    @Inject
    private ClientService clientService;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Logic to handle GET requests, e.g., list clients
        //request.setAttribute("clients", clientService.findClientById("1")); // Assuming this method exists
        request.getRequestDispatcher("/clientList.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Logic to handle POST requests, e.g., add a new client
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        Client client = new Client();
        client.setName(name);
        client.setEmail(email);
        clientService.addClient(client);
        response.sendRedirect("client"); // Redirect to the client list
    }
}