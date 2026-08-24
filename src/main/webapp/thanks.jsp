<!DOCTYPE html>
<html>

<head>

    <meta charset="UTF-8">

    <title>Survey Results</title>

    <link rel="stylesheet"
          href="styles/main.css"
          type="text/css">

</head>

<body>

    <h1>Thanks for filling out our survey!</h1>

    <p>Here is the information you provided:</p>

    <label>First Name:</label>
    <span>${user.firstName}</span>
    <br>

    <label>Last Name:</label>
    <span>${user.lastName}</span>
    <br>

    <label>Email:</label>
    <span>${user.email}</span>
    <br>

    <label>Date of Birth:</label>
    <span>${user.birthDate}</span>
    <br>

    <label>Heard from:</label>
    <span>${user.source}</span>
    <br>

    <label>Announcements:</label>
    <span>${user.announcements}</span>
    <br>

    <label>Email Updates:</label>
    <span>${user.emailUpdates}</span>
    <br>

    <label>Contact by:</label>
    <span>${user.contact}</span>
    <br>

    <p>
        To enter another survey, click on the Back button
        in your browser or the Return button shown below.
    </p>

    <form action="emailList" method="get">

        <input type="hidden"
               name="action"
               value="join">

        <input type="submit"
               value="Return">

    </form>

</body>

</html>