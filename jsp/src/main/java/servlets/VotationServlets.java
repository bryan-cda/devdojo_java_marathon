package servlets;

import beans.Candidates;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet("/VotationServlets")
public class VotationServlets extends HttpServlet {
    String winner = "";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String candidate1 = request.getParameter("candidate1");
       String candidate2 = request.getParameter("candidate2");
       String candidate3 = request.getParameter("candidate3");
       String candidate4 = request.getParameter("candidate4");
       String candidate5 = request.getParameter("candidate5");
       Long numberOfVotes = Long.valueOf(request.getParameter("votes"));

       Random votes = new Random(numberOfVotes);

        Candidates c1 = new Candidates();
        c1.setCadidate1(candidate1);
        c1.setVote1(votes.nextLong());
        System.out.println(c1.getVote1());

        Candidates c2 = new Candidates();
        c2.setCadidate2(candidate2);
        c2.setVote2(votes.nextLong());
        System.out.println(c2.getVote2());



        Candidates c3 = new Candidates();
        c3.setCadidate3(candidate3);
        c3.setVote3(votes.nextLong());
        System.out.println(c3.getVote3());



        Candidates c4 = new Candidates();
        c4.setCadidate4(candidate4);
        c4.setVote4(votes.nextLong());
        System.out.println(c4.getVote4());


        Candidates c5 = new Candidates();
        c5.setCadidate5(candidate5);
        c5.setVote5(votes.nextLong());
        System.out.println(c5.getVote5());

        if(c1.getVote1() > c2.getVote2() && c1.getVote1() > c3.getVote3() && c1.getVote1() > c4.getVote4() && c1.getVote1() > c5.getVote5()){
            System.out.println(c1.getCadidate1() + " É O VENCEDOR");
            setWinner(candidate1);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/ResultVotation.jsp");
            requestDispatcher.forward(request,response);
        } else {
            if (c2.getVote2() > c1.getVote1() && c2.getVote2() > c3.getVote3() && c2.getVote2() > c4.getVote4() && c2.getVote2() > c5.getVote5()) {
                System.out.println(c2.getCadidate2() + " É O VENCEDOR");
                setWinner(candidate2);
                c2.setWinner(candidate2);
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("/ResultVotation.jsp");
                requestDispatcher.forward(request,response);
            } else {
                if (c3.getVote3() > c1.getVote1() && c3.getVote3() > c2.getVote2() && c3.getVote3() > c4.getVote4() && c3.getVote3() > c5.getVote5()) {
                    System.out.println(c3.getCadidate3() + " É O VENCEDOR");
                    setWinner(candidate3);
                    RequestDispatcher requestDispatcher = request.getRequestDispatcher("/ResultVotation.jsp");
                    requestDispatcher.forward(request,response);

                } else {
                    if (c4.getVote4() > c1.getVote1() && c4.getVote4() > c2.getVote3() && c4.getVote4() > c3.getVote3() && c4.getVote4() > c5.getVote5()) {
                        System.out.println(c4.getCadidate4() + " É O VENCEDOR");
                        setWinner(candidate4);
                        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/ResultVotation.jsp");
                        requestDispatcher.forward(request,response);

                    } else {
                        if (c5.getVote5() > c1.getVote1() && c5.getVote5() > c2.getVote2() && c5.getVote5() > c3.getVote3() && c5.getVote5() > c4.getVote4()) {
                            System.out.println(c4.getCadidate4() + " É O VENCEDOR");
                            setWinner(candidate4);
                            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/ResultVotation.jsp");
                            requestDispatcher.forward(request,response);

                        }
                    }
                }
            }
        }

    }

    public String getWinner(){
        return winner ;
    }





    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    public void setWinner(String winner) {
        this.winner = winner;
    }




}
