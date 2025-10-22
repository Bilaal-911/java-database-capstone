## MySQL Database Design

### Table: patients
- id: INT, Primary Key, AUTO_INCREMENT  
- first_name: VARCHAR(100), NOT NULL  
- last_name: VARCHAR(100), NOT NULL  
- date_of_birth: DATE, NOT NULL  
- gender: ENUM('Male', 'Female', 'Other'), NOT NULL  
- phone: VARCHAR(15), UNIQUE  
- email: VARCHAR(150), UNIQUE  
- address: TEXT  

**Notes:**  
- Each patient must have unique contact info.  
- Phone/email validation handled at application level.  
- If a patient is deleted, we may use **ON DELETE CASCADE** to remove their appointments, or mark as "inactive" instead.

  ### Table: doctors
- id: INT, Primary Key, AUTO_INCREMENT  
- first_name: VARCHAR(100), NOT NULL  
- last_name: VARCHAR(100), NOT NULL  
- specialty: VARCHAR(150), NOT NULL  
- phone: VARCHAR(15), UNIQUE  
- email: VARCHAR(150), UNIQUE  
- clinic_location_id: INT, Foreign Key → clinic_locations(id)  

**Notes:**  
- Each doctor is tied to a location.  
- No overlapping appointments allowed → enforce via application logic.

  
### Table: clinic_locations
- id: INT, Primary Key, AUTO_INCREMENT  
- name: VARCHAR(150), NOT NULL  
- address: TEXT, NOT NULL  
- phone: VARCHAR(15)  

**Notes:**  
- Allows system to scale with multiple clinics.  
- Doctors reference this table.  

---

### Table: appointments
- id: INT, Primary Key, AUTO_INCREMENT  
- doctor_id: INT, Foreign Key → doctors(id)  
- patient_id: INT, Foreign Key → patients(id)  
- appointment_time: DATETIME, NOT NULL  
- status: ENUM('Scheduled', 'Completed', 'Cancelled'), DEFAULT 'Scheduled'  

**Notes:**  
- Appointment is always tied to one doctor and one patient.  
- If doctor or patient deleted, cascade rules should apply.  
- History should be retained for medical/legal reasons → use soft delete instead of hard delete.  



### Table: payments
- id: INT, Primary Key, AUTO_INCREMENT  
- appointment_id: INT, Foreign Key → appointments(id)  
- amount: DECIMAL(10,2), NOT NULL  
- method: ENUM('Cash', 'Card', 'Online'), NOT NULL  
- status: ENUM('Pending', 'Paid', 'Failed'), DEFAULT 'Pending'  
- created_at: TIMESTAMP, DEFAULT CURRENT_TIMESTAMP  

**Notes:**  
- Payments are linked to appointments for billing.  
- One appointment → one payment transaction record.  

---

### Table: admin
- id: INT, Primary Key, AUTO_INCREMENT  
- username: VARCHAR(50), UNIQUE, NOT NULL  
- password_hash: VARCHAR(255), NOT NULL  
- role: ENUM('Admin', 'Staff'), DEFAULT 'Staff'  

**Notes:**  
- Stores system admin and staff accounts.  
- Passwords must always be hashed (never stored in plain text).  


## MongoDB Collection Design

### Collection: doctor_notes

Doctors often write free-form notes after a consultation. These notes may include observations, follow-ups, and feedback.  
This is a good fit for MongoDB because the structure can vary for each appointment.

```json
{
  "_id": "ObjectId('6510abc123456')",
  "appointmentId": 1021,
  "patientId": 3005,
  "doctorId": 42,
  "notes": "Patient reports mild headache, prescribed Ibuprofen. Monitor blood pressure.",
  "tags": ["headache", "blood pressure", "medication"],
  "attachments": [
    {
      "fileName": "bp_readings.pdf",
      "uploadedAt": "2025-10-01T10:45:00Z"
    }
  ],
  "feedback": {
    "patientRating": 4,
    "patientComment": "Doctor was very attentive."
  },
  "metadata": {
    "createdAt": "2025-10-02T09:30:00Z",
    "lastUpdated": "2025-10-02T11:15:00Z",
    "editedBy": "doctor"
  }
}


