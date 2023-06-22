import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-icons/vaadin-icons.js';

@customElement('vista-vista_detalle__no_registrado_')
export class VistaVista_detalle__no_registrado_ extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%; position: absolute;">
 <div id="divCabecera" style="width: 100%; height: 5%;"></div>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 95%;">
  <vaadin-vertical-layout style="width: 50%; height: 100%; align-items: center; justify-content: center;">
   <vaadin-vertical-layout id="vlVideo" style="align-items: center; justify-content: center; max-width: 100%; max-height: 100%; width: 100%; height: 100%;"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 50%; height: 100%; align-items: center; justify-content: center;">
   <img style="max-width: 20%; max-height: 20%;" id="image">
   <label id="labelUsuario">Usuario</label>
   <vaadin-horizontal-layout style="height: 5%; width: 60%; align-items: center; justify-content: space-around;">
    <label id="labelFecha">Fecha</label>
    <label id="labelUbicacion">Ubicacion</label>
   </vaadin-horizontal-layout>
   <label id="labelDescripcion">Label</label>
   <div style="width: 100%; height: 40%;">
    <vaadin-scroller id="scroller" style="width: 100%; height: 100%;"></vaadin-scroller>
   </div>
   <vaadin-horizontal-layout style="width: 100%; justify-content: center; align-items: center;">
    <vaadin-vertical-layout style="align-items: center; justify-content: center;">
     <vaadin-button theme="icon" aria-label="Add new" id="bVerMeGustas">
      <iron-icon icon="vaadin:heart"></iron-icon>
     </vaadin-button>
     <label id="labelMeGustas">Label</label>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
