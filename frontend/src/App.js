import React, { useEffect, useState } from 'react';
import axios from 'axios';

function App() {
  const [parcels, setParcels] = useState([]);
  const [trackingId, setTrackingId] = useState('');
  const [newParcel, setNewParcel] = useState({
    trackingId: '',
    senderName: '',
    receiverName: '',
    originAddress: '',
    destinationAddress: ''
  });

  // Fetch all parcels on load
  useEffect(() => {
    fetchParcels();
  }, []);

  const fetchParcels = async () => {
    const response = await axios.get('http://localhost:8081/api/parcels');
    setParcels(response.data);
  };

  const searchParcel = async () => {
    const response = await axios.get(`http://localhost:8081/api/parcels/${trackingId}`);
    alert(JSON.stringify(response.data, null, 2));
  };

  const handleInput = (e) => {
    setNewParcel({ ...newParcel, [e.target.name]: e.target.value });
  };

  const createParcel = async () => {
    await axios.post('http://localhost:8081/api/parcels', newParcel);
    alert('Parcel created!');
    fetchParcels(); // Refresh list
  };

  return (
    <div style={{ padding: 20 }}>
      <h1>📦 Parcel Service</h1>

      <h2>Create Parcel</h2>
      <input name="trackingId" placeholder="Tracking ID" onChange={handleInput} /><br />
      <input name="senderName" placeholder="Sender Name" onChange={handleInput} /><br />
      <input name="receiverName" placeholder="Receiver Name" onChange={handleInput} /><br />
      <input name="originAddress" placeholder="Origin Address" onChange={handleInput} /><br />
      <input name="destinationAddress" placeholder="Destination Address" onChange={handleInput} /><br />
      <button onClick={createParcel}>Create</button>

      <h2>Search Parcel</h2>
      <input value={trackingId} onChange={e => setTrackingId(e.target.value)} placeholder="Enter Tracking ID" />
      <button onClick={searchParcel}>Search</button>

      <h2>All Parcels</h2>
      <ul>
        {parcels.map(parcel => (
          <li key={parcel.id}>
            <strong>{parcel.trackingId}</strong> - {parcel.status} ({parcel.originAddress} → {parcel.destinationAddress})
          </li>
        ))}
      </ul>
    </div>
  );
}

export default App;
